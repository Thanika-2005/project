package com.example.reclothify_sales;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class gpay extends AppCompatActivity {
    private EditText amount;
    private Button pay;
    private static final String GOOGLE_PAY_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";
    private static final int GOOGLE_PAY_REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpay);

        // Find the EditText and Button by their ID from the XML layout
        amount = findViewById(R.id.amount);
        pay = findViewById(R.id.Pay_Button);

        // Set an OnClickListener on the pay button to trigger payment
        pay.setOnClickListener(v -> {
            String amt = amount.getText().toString();
            if (amt.isEmpty()) {
                // If the amount is not entered, show a Toast
                Toast.makeText(gpay.this, "Enter amount", Toast.LENGTH_SHORT).show();
            } else {
                // Build UPI payment URI for Google Pay
                Uri uri = new Uri.Builder()
                        .scheme("upi")
                        .authority("pay")
                        .appendQueryParameter("pa", "your-merchant-vpa@xxx") // Replace with your actual merchant VPA
                        .appendQueryParameter("pn", "reclothify")  // Merchant/Organization name
                        .appendQueryParameter("mc", "")  // Merchant code, optional
                        .appendQueryParameter("tr", "123456")  // Transaction reference ID
                        .appendQueryParameter("tn", "your-note")  // Transaction note/message
                        .appendQueryParameter("am", amt)  // Entered amount
                        .appendQueryParameter("cu", "INR")  // Currency code
                        .appendQueryParameter("url", "your-transaction-url")  // Transaction URL, optional
                        .build();

                // Create an intent to launch the Google Pay app with the UPI URI
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(uri);
                intent.setPackage(GOOGLE_PAY_PACKAGE_NAME);

                // Start the Google Pay activity and await the result
                startActivityForResult(intent, GOOGLE_PAY_REQUEST_CODE);
            }
        });
    }

    // Handle the result from Google Pay
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GOOGLE_PAY_REQUEST_CODE) {
            // Payment succeeded
            if (resultCode == RESULT_OK && data != null) {
                String transactionStatus = data.getStringExtra("Status");
                if (transactionStatus != null && transactionStatus.equalsIgnoreCase("success")) {
                    Toast.makeText(this, "Payment Success", Toast.LENGTH_SHORT).show();
                } else {
                    // Payment failed
                    Toast.makeText(this, "Payment Failed", Toast.LENGTH_SHORT).show();
                }
            } else {
                // Payment failed
                Toast.makeText(this, "Payment Failed", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

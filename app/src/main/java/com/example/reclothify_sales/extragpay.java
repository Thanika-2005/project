package com.example.reclothify_sales;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class extragpay extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extra_gpay);

        // Button for 'Next' (button7)
        Button myButton = findViewById(R.id.Pay_Button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(extragpay.this, tqpage.class);
                startActivity(intent);
                Toast.makeText(extragpay.this, "Next clicked!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

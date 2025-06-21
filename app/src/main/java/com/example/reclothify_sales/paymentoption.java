package com.example.reclothify_sales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class paymentoption extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.paymentoption);
// Finding the button in the layout
        Button myButton = findViewById(R.id.redirctbtn_tq); // Replace with your actual button ID

        // Setting an OnClickListener to the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the button is clicked
                Intent intent = new Intent(paymentoption.this, gpay.class);
                startActivity(intent);
                Toast.makeText(paymentoption.this,"gpay clicked !" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}

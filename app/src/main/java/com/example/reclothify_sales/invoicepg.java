package com.example.reclothify_sales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class invoicepg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoicepg);

        // Finding the button in the layout
        Button myBut = findViewById(R.id.button10); // Replace with your actual button ID

        // Setting an OnClickListener to the button
        myBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the button is clicked
                Intent intent = new Intent(invoicepg.this, tqpage.class);
                startActivity(intent);
            }
        });
    }
}

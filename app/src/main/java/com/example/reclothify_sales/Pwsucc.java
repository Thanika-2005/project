package com.example.reclothify_sales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pwsucc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pwsucc);

        // Finding the button in the layout
        Button myButton = findViewById(R.id.button4); // Replace with your actual button ID

        // Setting an OnClickListener to the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the button is clicked
                Intent intent = new Intent(Pwsucc.this, organisationhomepg.class);
                startActivity(intent);
            }
        });
    }
}

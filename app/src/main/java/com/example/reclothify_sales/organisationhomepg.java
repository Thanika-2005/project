package com.example.reclothify_sales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class organisationhomepg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_organisationhomepg);
// Finding the button in the layout
        Button myButton = findViewById(R.id.button4); // Replace with your actual button ID

        // Setting an OnClickListener to the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the button is clicked
                Intent intent = new Intent(organisationhomepg.this, selectproduct.class);
                startActivity(intent);
                Toast.makeText(organisationhomepg.this,"Orphanage clicked !" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}

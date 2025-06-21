package com.example.reclothify_sales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class addtocart2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtocart2);

        // Button for 'Next' (button7)
        Button myButton = findViewById(R.id.redirctbtn_tq);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addtocart2.this, extragpay.class);
                startActivity(intent);
                Toast.makeText(addtocart2.this, "Next clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        // ImageView for 'Image19'
        ImageView myImage = findViewById(R.id.imageView19);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addtocart2.this, invoicepg.class);
                startActivity(intent);
                Toast.makeText(addtocart2.this, "UPI clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

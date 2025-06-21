package com.example.reclothify_sales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class tqpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tqpage);

        // Finding the buttons in the layout
        Button viewOrderButton = findViewById(R.id.button8); // View order button
        Button viewTransactionButton = findViewById(R.id.button9); // View transaction details button
        ImageView cartImageView = findViewById(R.id.group_2939); // Cart icon ImageView

        // Setting OnClickListener for "View Order" button
        viewOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigates to list_item activity when "View Order" is clicked
                Intent intent = new Intent(tqpage.this, list_item.class);
                startActivity(intent);
            }
        });

        // Setting OnClickListener for "View Transaction Details" button
        viewTransactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigates to invoicepg activity when "View Transaction Details" is clicked
                Intent intent = new Intent(tqpage.this, invoicepg.class);
                startActivity(intent);
            }
        });

        // Setting OnClickListener for the cart icon ImageView
        cartImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigates to list_item activity when cart icon is clicked
                Intent intent = new Intent(tqpage.this, list_item.class);
                startActivity(intent);
            }
        });
    }
}

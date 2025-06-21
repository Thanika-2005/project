package com.example.reclothify_sales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class addtocart extends AppCompatActivity {

    int quantity = 0;
    ImageView productImage;
    TextView productCountText;
    int[] images = {R.drawable.image_420, R.drawable.image_421}; // Add your carousel images here
    int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtocart);

        // Get references to UI elements
        Button addToCartButton = findViewById(R.id.addToCartButton);
        ImageView plusButton = findViewById(R.id.plusButton);
        ImageView minusButton = findViewById(R.id.minusButton);
        TextView productPriceText = findViewById(R.id.productPrice);
        productCountText = findViewById(R.id.productCount);
        ImageView rightArrow = findViewById(R.id.rightArrow);
        ImageView leftArrow = findViewById(R.id.leftArrow);
        productImage = findViewById(R.id.productImage);

        // Plus button to increase quantity
        plusButton.setOnClickListener(v -> {
            quantity++;
            updateUI(productPriceText);
        });

        // Minus button to decrease quantity
        minusButton.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                updateUI(productPriceText);
            }
        });

        // Right arrow to change image to the next in the carousel
        rightArrow.setOnClickListener(v -> {
            currentImageIndex = (currentImageIndex + 1) % images.length;
            productImage.setImageResource(images[currentImageIndex]);
        });

        // Left arrow to go back to the first image
        leftArrow.setOnClickListener(v -> {
            currentImageIndex = 0;
            productImage.setImageResource(images[currentImageIndex]);
        });

        // Add to cart button to redirect to next page
        addToCartButton.setOnClickListener(v -> {
            Intent intent = new Intent(addtocart.this, addtocart2.class);
            startActivity(intent);
            Toast.makeText(addtocart.this, "Added to cart", Toast.LENGTH_SHORT).show();
        });
    }

    private void updateUI(TextView productPriceText) {
        int pricePerItem = 80;
        int totalPrice = quantity * pricePerItem;
        productCountText.setText(String.valueOf(quantity));
        productPriceText.setText("Rs. " + totalPrice);
    }
}

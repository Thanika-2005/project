package com.example.reclothify_sales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class pricerange extends AppCompatActivity {

    String[] items = {"below 100", "below 200", "below 300", "below 400"};
    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pricerange);

        // Initialize the AutoCompleteTextView and adapter
        autoCompleteTxt = findViewById(R.id.auto_complete_text);
        adapterItems = new ArrayAdapter<>(this, R.layout.list_item, items);
        autoCompleteTxt.setAdapter(adapterItems);

        // Set the item click listener for the AutoCompleteTextView
        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();
            }
        });

        // Initialize the button and set its click listener
        Button myButton = findViewById(R.id.button); // Replace with your actual button ID
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the button is clicked
                Intent intent = new Intent(pricerange.this, addtocart.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.reclothify_sales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Login extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference ref;
    EditText edit_username,edit_pass;
    Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        database = FirebaseDatabase.getInstance();
        ref = database.getReference();

        edit_username = findViewById(R.id.login_email);
        edit_pass = findViewById(R.id.login_pass);
        btn_login = findViewById(R.id.login_butt);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pwsucc.class);
                startActivity(intent);
                if (edit_username.getText().toString().equals("Thanika")&& edit_pass.getText().toString().equals("1234")){
                    Toast.makeText(Login.this,"login Successful !" , Toast.LENGTH_SHORT).show();
                } else if (edit_username.getText().toString().equals("Swetha")&& edit_pass.getText().toString().equals("1234")) {
                    Toast.makeText(Login.this, "login Successful !", Toast.LENGTH_SHORT).show();
                }else if (edit_username.getText().toString().equals("Ramya")&& edit_pass.getText().toString().equals("1234")) {
                    Toast.makeText(Login.this, "login Successful !", Toast.LENGTH_SHORT).show();
                }else if (edit_username.getText().toString().equals("Rubasri")&& edit_pass.getText().toString().equals("1234")) {
                    Toast.makeText(Login.this, "login Successful !", Toast.LENGTH_SHORT).show();
                }else if (edit_username.getText().toString().equals("Ranjith")&& edit_pass.getText().toString().equals("1234")) {
                    Toast.makeText(Login.this, "login Successful !", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Login.this,"login Unsuccessful! Please check your username and password",Toast.LENGTH_LONG ).show();
                    Intent intent1 = new Intent(getApplicationContext(), Login.class);
                    startActivity(intent1);
                }
                HashMap hashMap = new HashMap();

                hashMap.put("name",edit_username.getText().toString());
                hashMap.put("pass",edit_pass.getText().toString());

                ref.child("users").push().setValue(hashMap);
            }

        });




    }
}
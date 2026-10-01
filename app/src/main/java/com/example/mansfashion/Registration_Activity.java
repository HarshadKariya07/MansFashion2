package com.example.mansfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Registration_Activity extends AppCompatActivity {

    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btnSave=findViewById(R.id.btnSave);

        btnSave.setOnClickListener(v -> {

            Intent intent=new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
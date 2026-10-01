package com.example.mansfashion;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Jogger extends AppCompatActivity {

    TextView txtPant7;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jogger);

        txtPant7=findViewById(R.id.txtPant7);

        txtPant7.setOnClickListener(v -> {
            Intent intent=new Intent(this,Payment_Method_Activity.class);
            startActivity(intent);
        });
    }
}
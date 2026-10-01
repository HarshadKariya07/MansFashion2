package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Nike_Stylish_Shoes_Activity extends AppCompatActivity {

    TextView txtShoes2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nike_stylish_shoes);

        txtShoes2=findViewById(R.id.txtShoes2);

        txtShoes2.setOnClickListener(v -> {
            Intent intent=new Intent(this,Payment_Method_Activity.class);
            startActivity(intent);
        });

    }
}
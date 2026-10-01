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

public class Payment_Method_Activity extends AppCompatActivity {

    TextView txtBuy;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_payment_method);

        txtBuy=findViewById(R.id.txtBuy);

        txtBuy.setOnClickListener(v -> {
            Intent intent=new Intent(this, Oder_Confirm.class);
            startActivity(intent);
        });


    }
}
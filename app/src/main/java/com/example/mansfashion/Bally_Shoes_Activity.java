package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Bally_Shoes_Activity extends AppCompatActivity {

    TextView txtShoes10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bally_shoes);

        txtShoes10=findViewById(R.id.txtShoes10);

        txtShoes10.setOnClickListener(v -> {
            Intent intent=new Intent(this,Payment_Method_Activity.class);
            startActivity(intent);
        });


    }
}
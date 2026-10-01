package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Doxa_Watch_Activity extends AppCompatActivity {

    TextView txtWatch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doxa_watch);

        txtWatch1=findViewById(R.id.txtWatch1);

        txtWatch1.setOnClickListener(v -> {
            Intent intent=new Intent(this,Payment_Method_Activity.class);
            startActivity(intent);
        });

    }
}
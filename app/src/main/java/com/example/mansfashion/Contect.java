package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Contect extends AppCompatActivity {

    TextView txtSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contect);

        txtSend=findViewById(R.id.txtSend);

        txtSend.setOnClickListener(v -> {
            Intent intent=new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}
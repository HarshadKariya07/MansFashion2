package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Denim_Jeans extends AppCompatActivity {

    TextView txtdenimjeans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_denim_jeans);

        txtdenimjeans=findViewById(R.id.txtdenimjeans);

        txtdenimjeans.setOnClickListener(v -> {
            Intent intent=new Intent(this, Payment_Method_Activity.class);
            startActivity(intent);
        });
    }
}
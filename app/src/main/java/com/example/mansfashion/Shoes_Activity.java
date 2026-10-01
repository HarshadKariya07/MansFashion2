package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Shoes_Activity extends AppCompatActivity {

    ImageView shoes1Img,shoes2Img,shoes3Img,shoes4Img,shoes5Img,shoes6Img,shoes7Img,shoes8Img,shoes9Img,
            shoes10Img,shoes11Img,shoes12Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shoes);

        shoes1Img=findViewById(R.id.shoes1Img);
        shoes2Img=findViewById(R.id.shoes2Img);
        shoes3Img=findViewById(R.id.shoes3Img);
        shoes4Img=findViewById(R.id.shoes4Img);
        shoes5Img=findViewById(R.id.shoes5Img);
        shoes6Img=findViewById(R.id.shoes6Img);
        shoes7Img=findViewById(R.id.shoes7Img);
        shoes8Img=findViewById(R.id.shoes8Img);
        shoes9Img=findViewById(R.id.shoes9Img);
        shoes10Img=findViewById(R.id.shoes10Img);
        shoes11Img=findViewById(R.id.shoes11Img);
        shoes12Img=findViewById(R.id.shoes12Img);

        shoes1Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Walking_Shoes_Activity.class);
            startActivity(intent);
        });

        shoes2Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Nike_Stylish_Shoes_Activity.class);
            startActivity(intent);
        });

        shoes3Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Stylish_Formal_Shoes_Activity.class);
            startActivity(intent);
        });

        shoes4Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Casual_Shoes_Activity.class);
            startActivity(intent);
        });

        shoes5Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Casual_Shoes2_Activity.class);
            startActivity(intent);
        });

        shoes6Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Casual_Shoes3_Activity.class);
            startActivity(intent);
        });

        shoes7Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Derby_Shoes_Activity.class);
            startActivity(intent);
        });

        shoes8Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sneaker_Shoes_Activity.class);
            startActivity(intent);
        });

        shoes9Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Asics_Shoes_Activity.class);
            startActivity(intent);
        });

        shoes10Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Bally_Shoes_Activity.class);
            startActivity(intent);
        });

        shoes11Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Barker_Shoes_Activity.class);
            startActivity(intent);
        });

        shoes12Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Campus_Shoes_Activity.class);
            startActivity(intent);
        });

    }
}
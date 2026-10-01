package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Goggles_Activity extends AppCompatActivity {

    ImageView goggles1Img,goggles2Img,goggles3Img,goggles4Img,goggles5Img,goggles6Img,goggles7Img,goggles8Img,goggles9Img,
            goggles10Img,goggles11Img,goggles12Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_goggles);

        goggles1Img=findViewById(R.id.goggles1Img);
        goggles2Img=findViewById(R.id.goggles2Img);
        goggles3Img=findViewById(R.id.goggles3Img);
        goggles4Img=findViewById(R.id.goggles4Img);
        goggles5Img=findViewById(R.id.goggles5Img);
        goggles6Img=findViewById(R.id.goggles6Img);
        goggles7Img=findViewById(R.id.goggles7Img);
        goggles8Img=findViewById(R.id.goggles8Img);
        goggles9Img=findViewById(R.id.goggles9Img);
        goggles10Img=findViewById(R.id.goggles10Img);
        goggles11Img=findViewById(R.id.goggles11Img);
        goggles12Img=findViewById(R.id.goggles12Img);

        goggles1Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Gucci_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles2Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Hexagon_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles3Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Stylish_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles4Img.setOnClickListener(v -> {
            Intent intent=new Intent(this,Designer_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles5Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Black_Jones_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles6Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Gucci_Sunglasses2_Activity.class);
            startActivity(intent);
        });

        goggles7Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Square_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles8Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Lenskart_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles9Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Round_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles10Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Versace_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles11Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Vintage_Sunglasses_Activity.class);
            startActivity(intent);
        });

        goggles12Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Lenskart_Sunglasses_Activity.class);
            startActivity(intent);
        });

    }
}
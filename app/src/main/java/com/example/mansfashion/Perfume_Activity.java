package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Perfume_Activity extends AppCompatActivity {

    ImageView perfume1Img,perfume2Img,perfume3Img,perfume4Img,perfume5Img,perfume6Img,perfume7Img,perfume8Img,perfume9Img,
            perfume10Img,perfume11Img,perfume12Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_perfume);

        perfume1Img=findViewById(R.id.perfume1Img);
        perfume2Img=findViewById(R.id.perfume2Img);
        perfume3Img=findViewById(R.id.perfume3Img);
        perfume4Img=findViewById(R.id.perfume4Img);
        perfume5Img=findViewById(R.id.perfume5Img);
        perfume6Img=findViewById(R.id.perfume6Img);
        perfume7Img=findViewById(R.id.perfume7Img);
        perfume8Img=findViewById(R.id.perfume8Img);
        perfume9Img=findViewById(R.id.perfume9Img);
        perfume10Img=findViewById(R.id.perfume10Img);
        perfume11Img=findViewById(R.id.perfume11Img);
        perfume12Img=findViewById(R.id.perfume12Img);

        perfume1Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Cerins_Perfume_Activity.class);
            startActivity(intent);
        });

        perfume2Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blue_Rain_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume3Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Chpee_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume4Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Envy_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume5Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Fire_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume6Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Fogg_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume7Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Genre_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume8Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Jaguar_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume9Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Marque_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume10Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Marine_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume11Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Oud_Perfume_Activity.class);
            startActivity(intent);
        });


        perfume12Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Polo_Perfume_Activity.class);
            startActivity(intent);
        });


    }
}
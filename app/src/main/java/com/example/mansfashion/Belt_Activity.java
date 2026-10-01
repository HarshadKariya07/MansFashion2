package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Belt_Activity extends AppCompatActivity {

    ImageView belt1Img,belt2Img,belt3Img,belt4Img,belt5Img,belt6Img,belt7Img,belt8Img,belt9Img,belt10Img,
            belt11Img,belt12Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_belt);

        belt1Img=findViewById(R.id.belt1Img);
        belt2Img=findViewById(R.id.belt2Img);
        belt3Img=findViewById(R.id.belt3Img);
        belt4Img=findViewById(R.id.belt4Img);
        belt5Img=findViewById(R.id.belt5Img);
        belt6Img=findViewById(R.id.belt6Img);
        belt7Img=findViewById(R.id.belt7Img);
        belt8Img=findViewById(R.id.belt8Img);
        belt9Img=findViewById(R.id.belt9Img);
        belt10Img=findViewById(R.id.belt10Img);
        belt11Img=findViewById(R.id.belt11Img);
        belt12Img=findViewById(R.id.belt12Img);

        belt1Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Hidesign_Belt_Activity.class);
            startActivity(intent);
        });

        belt2Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Lether_Belt_Activity.class);
            startActivity(intent);
        });

        belt3Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Main_Street_Forge_Activity.class);
            startActivity(intent);
        });

        belt4Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Puma_Belt_Activity.class);
            startActivity(intent);
        });

        belt5Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tom_Ford_Belt_Activity.class);
            startActivity(intent);
        });

        belt6Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tommy_Hilfiger_Belt_Activity.class);
            startActivity(intent);
        });

        belt7Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Woodland_Belt_Activity.class);
            startActivity(intent);
        });

        belt8Img.setOnClickListener(v -> {
            Intent intent=new Intent(this,Gucci_Belt_Activity.class);
            startActivity(intent);
        });

        belt9Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Levis_Belt_Activity.class);
            startActivity(intent);
        });

        belt10Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Lether_Belt2_Activity.class);
            startActivity(intent);
        });

        belt11Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Woodland_Belt2_Activity.class);
            startActivity(intent);
        });

        belt12Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Coach_Belt_Activity.class);
            startActivity(intent);
        });
    }
}
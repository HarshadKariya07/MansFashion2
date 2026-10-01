package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Slipper_Activity extends AppCompatActivity {

    ImageView slipper1Img,slipper2Img,slipper3Img,slipper4Img,slipper5Img,slipper6Img,slipper7Img,slipper8Img,slipper9Img,
            slipper10Img,slipper11Img,slipper12Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_slipper);

        slipper1Img=findViewById(R.id.slipper1Img);
        slipper2Img=findViewById(R.id.slipper2Img);
        slipper3Img=findViewById(R.id.slipper3Img);
        slipper4Img=findViewById(R.id.slipper4Img);
        slipper5Img=findViewById(R.id.slipper5Img);
        slipper6Img=findViewById(R.id.slipper6Img);
        slipper7Img=findViewById(R.id.slipper7Img);
        slipper8Img=findViewById(R.id.slipper8Img);
        slipper9Img=findViewById(R.id.slipper9Img);
        slipper10Img=findViewById(R.id.slipper10Img);
        slipper11Img=findViewById(R.id.slipper11Img);
        slipper12Img=findViewById(R.id.slipper12Img);

        slipper1Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Yoho_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper2Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Bata_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper3Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Campus_Shoes_Activity.class);
            startActivity(intent);
        });

        slipper4Img.setOnClickListener(v -> {
            Intent intent=new Intent(this,Crocs_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper5Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Liberty_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper6Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Neemas_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper7Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Paragon_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper8Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Puma_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper9Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Skecher_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper10Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sparx_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper11Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, U_S_Polo_Slipper_Activity.class);
            startActivity(intent);
        });

        slipper12Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, walkaroo_Slipper_Activity.class);
            startActivity(intent);
        });
    }
}
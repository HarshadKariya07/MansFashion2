package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pent_Activity extends AppCompatActivity {


    ImageView pant1Img,pant2Img,pant3Img,pant4Img,pant5Img,pant6Img,pant7Img,pant8Img,pant9Img,pant10Img,pant11Img,pant12Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pent);


        pant1Img=findViewById(R.id.pant1Img);
        pant2Img=findViewById(R.id.pant2Img);
        pant3Img=findViewById(R.id.pant3Img);
        pant4Img=findViewById(R.id.pant4Img);
        pant5Img=findViewById(R.id.pant5Img);
        pant6Img=findViewById(R.id.pant6Img);
        pant7Img=findViewById(R.id.pant7Img);
        pant8Img=findViewById(R.id.pant8Img);
        pant9Img=findViewById(R.id.pant9Img);
        pant10Img=findViewById(R.id.pant10Img);
        pant11Img=findViewById(R.id.pant11Img);
        pant12Img=findViewById(R.id.pant12Img);

        pant1Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Denim_Jeans.class);
            startActivity(intent);
        });

        pant2Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Cargo_Jeans.class);
            startActivity(intent);
        });

        pant3Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Jeans.class);
            startActivity(intent);
        });

        pant4Img.setOnClickListener(v -> {
            Intent intent=new Intent( this, Calvin_Klein.class);
            startActivity(intent);
        });

        pant5Img.setOnClickListener(v -> {
            Intent intent=new Intent(this,Louis_Philippe.class);
            startActivity(intent);
        });

        pant6Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Park_Avenue.class);
            startActivity(intent);
        });

        pant7Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Jogger.class);
            startActivity(intent);
        });

        pant8Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Gussi.class);
            startActivity(intent);
        });

        pant9Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Lee.class);
            startActivity(intent);
        });

        pant10Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blackberry.class);
            startActivity(intent);
        });

        pant11Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Lacoste.class);
            startActivity(intent);
        });

        pant12Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Raymond.class);
            startActivity(intent);
        });

    }
}
package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class T_Shirt_Activity extends AppCompatActivity {

    ImageView tshirt1Img,tshirt2Img,tshirt3Img,tshirt4Img,tshirt5Img,tshirt6Img,tshirt7Img,tshirt8Img,
            tshirt9Img,tshirt10Img,tshirt11Img,tshirt12Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tshirt);

        tshirt1Img=findViewById(R.id.tshirt1Img);
        tshirt1Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, puma_tshirt_Activity.class);
            startActivity(intent);
        });
        tshirt2Img=findViewById(R.id.tshirt2Img);
        tshirt2Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Burbarry_tshirt.class);
            startActivity(intent);
        });
        tshirt3Img=findViewById(R.id.tshirt3Img);
        tshirt3Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Cotton_tshirt.class);
            startActivity(intent);
        });
        tshirt4Img=findViewById(R.id.tshirt4Img);
        tshirt4Img.setOnClickListener(v -> {
            Intent intent= new Intent(this, levis_tshirt.class);
            startActivity(intent);
        });
        tshirt5Img=findViewById(R.id.tshirt5Img);
        tshirt5Img.setOnClickListener(v -> {
            Intent intent= new Intent(this, Gucci_tshirt.class);
            startActivity(intent);
        });
        tshirt6Img=findViewById(R.id.tshirt6Img);
        tshirt6Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, puma3_tshirt.class);
            startActivity(intent);
        });
        tshirt7Img=findViewById(R.id.tshirt7Img);
        tshirt7Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, levis3_tshirt.class);
            startActivity(intent);
        });
        tshirt8Img=findViewById(R.id.tshirt8Img);
        tshirt8Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Roadster_tshirt.class);
            startActivity(intent);
        });
        tshirt9Img=findViewById(R.id.tshirt9Img);
        tshirt9Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, burberry2_tshirt.class);
            startActivity(intent);
        });
        tshirt10Img=findViewById(R.id.tshirt10Img);
        tshirt10Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Classic_tshirt.class);
            startActivity(intent);
        });
        tshirt11Img=findViewById(R.id.tshirt11Img);
        tshirt11Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, pink_tshirt.class);
            startActivity(intent);
        });
        tshirt12Img=findViewById(R.id.tshirt12Img);
        tshirt12Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, clearance_tshirt.class);
            startActivity(intent);
        });





    }
}
package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Shirt_Activity extends AppCompatActivity {

    ImageView shirt1,shirt2,shirt3,shirt4,shirt5,shirt6,shirt7,shirt8,shirt9,shirt10,shirt11,shirt12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shirt);

        shirt1=findViewById(R.id.shirt1Img);
        shirt2=findViewById(R.id.shirt2Img);
        shirt3=findViewById(R.id.shirt3Img);
        shirt4=findViewById(R.id.shirt4Img);
        shirt5=findViewById(R.id.shirt5Img);
        shirt6=findViewById(R.id.shirt6Img);
        shirt7=findViewById(R.id.shirt7Img);
        shirt8=findViewById(R.id.shirt8Img);
        shirt9=findViewById(R.id.shirt9Img);
        shirt10=findViewById(R.id.shirt10Img);
        shirt11=findViewById(R.id.shirt11Img);
        shirt12=findViewById(R.id.shirt12Img);

        shirt1.setOnClickListener(v -> {
            Intent intent=new Intent(this, Best_Shirt.class);
            startActivity(intent);
        });
        shirt2.setOnClickListener(v -> {
            Intent intent=new Intent(this, Formal_Shirt_Activity.class);
            startActivity(intent);
        });
        shirt3.setOnClickListener(v -> {
            Intent intent=new Intent(this, Allen_Solly_Shirt_Activity.class);
            startActivity(intent);
        });
        shirt4.setOnClickListener(v -> {
            Intent intent=new Intent(this, Apparel_Shirt_Activity.class);
            startActivity(intent);
        });
        shirt5.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blackberry_Shirt_Activity.class);
            startActivity(intent);
        });
        shirt6.setOnClickListener(v -> {
            Intent intent=new Intent(this, Peter_Shirt_Activity.class);
            startActivity(intent);
        });
        shirt7.setOnClickListener(v -> {
            Intent intent=new Intent(this, Rymond_Shirt_Activity.class);
            startActivity(intent);
        });
        shirt8.setOnClickListener(v -> {
            Intent intent=new Intent(this, van_heusen_shirt.class);
            startActivity(intent);
        });
        shirt9.setOnClickListener(v -> {
            Intent intent=new Intent(this, printed_shirts.class);
            startActivity(intent);
        });
        shirt10.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blackberry.class);
            startActivity(intent);
        });
        shirt11.setOnClickListener(v -> {
            Intent intent=new Intent(this, fendi_shirt.class);
            startActivity(intent);
        });
        shirt12.setOnClickListener(v -> {
            Intent intent=new Intent(this, ralfa_shirt.class);
            startActivity(intent);
        });

    }
}
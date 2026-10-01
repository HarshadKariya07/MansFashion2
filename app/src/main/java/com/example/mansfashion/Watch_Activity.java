package com.example.mansfashion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Watch_Activity extends AppCompatActivity {

    ImageView watch1Img,watch2Img,watch3Img,watch4Img,watch5Img,watch6Img,watch7Img,watch8Img,
            watch9Img,watch10Img,watch11Img,watch12Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_watch);

        watch1Img=findViewById(R.id.watch1Img);
        watch2Img=findViewById(R.id.watch2Img);
        watch3Img=findViewById(R.id.watch3Img);
        watch4Img=findViewById(R.id.watch4Img);
        watch5Img=findViewById(R.id.watch5Img);
        watch6Img=findViewById(R.id.watch6Img);
        watch7Img=findViewById(R.id.watch7Img);
        watch8Img=findViewById(R.id.watch8Img);
        watch9Img=findViewById(R.id.watch9Img);
        watch10Img=findViewById(R.id.watch10Img);
        watch11Img=findViewById(R.id.watch11Img);
        watch12Img=findViewById(R.id.watch12Img);

        watch1Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Doxa_Watch_Activity.class);
            startActivity(intent);
        });

        watch2Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Rolex_Watch_Activity.class);
            startActivity(intent);
        });

        watch3Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tisson_Watch_Activity.class);
            startActivity(intent);
        });

        watch4Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Plaget_Watch_Activity.class);
            startActivity(intent);
        });

        watch5Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sonata_Watch_Activity.class);
            startActivity(intent);
        });

        watch6Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, Casio_Watch_Activity.class);
            startActivity(intent);
        });

        watch7Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, iws_watch.class);
            startActivity(intent);
        });

        watch8Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, samsung_watch.class);
            startActivity(intent);
        });

        watch9Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, ios_watch.class);
            startActivity(intent);
        });

        watch10Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, noise_watch.class);
            startActivity(intent);
        });

        watch11Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, se_gps_watch.class);
            startActivity(intent);
        });

        watch12Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, fastrack_watch.class);
            startActivity(intent);
        });
    }
}
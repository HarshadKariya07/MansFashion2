package com.example.mansfashion;




import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ImageView shirtImg,tshirt13Img,pentImg,watchImg,gogglesImg,perfumeImg,beltImg,shoesImg,slipperImg,
            menubar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        mAuth = FirebaseAuth.getInstance();
        mAuth.signOut();
        shirtImg=findViewById(R.id.shirtImg);

        shirtImg.setOnClickListener(v -> {
            Intent intent=new Intent(this, Shirt_Activity.class);
            startActivity(intent);
        });
        pentImg=findViewById(R.id.pentImg);

        pentImg.setOnClickListener(v -> {
            Intent intent=new Intent(this, Pent_Activity.class);
            startActivity(intent);
        });

        tshirt13Img=findViewById(R.id.tshirt13Img);

        tshirt13Img.setOnClickListener(v -> {
            Intent intent=new Intent(this, T_Shirt_Activity.class);
            startActivity(intent);
        });

        watchImg=findViewById(R.id.watchImg);

        watchImg.setOnClickListener(v -> {
            Intent intent=new Intent(this, Watch_Activity.class);
            startActivity(intent);
        });

        gogglesImg=findViewById(R.id.gogglesImg);

        gogglesImg.setOnClickListener(v -> {
            Intent intent=new Intent(this, Goggles_Activity.class);
            startActivity(intent);
        });

        perfumeImg=findViewById(R.id.perfumeImg);

        perfumeImg.setOnClickListener(v -> {
            Intent intent=new Intent(this, Perfume_Activity.class);
            startActivity(intent);
        });

        beltImg=findViewById(R.id.beltImg);

        beltImg.setOnClickListener(v -> {
            Intent intent=new Intent(this, Belt_Activity.class);
            startActivity(intent);
        });

        shoesImg=findViewById(R.id.shoesImg);

        shoesImg.setOnClickListener(v -> {
            Intent intent=new Intent(this,Shoes_Activity.class);
            startActivity(intent);
        });

        slipperImg=findViewById(R.id.slipperImg);

        slipperImg.setOnClickListener(v -> {
            Intent intent=new Intent(this, Slipper_Activity.class);
            startActivity(intent);
        });

        menubar=findViewById(R.id.menubar);

        menubar.setOnClickListener(v -> {

        });

    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.my_menu, menu);
//        return true; // Return true to show the menu
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle item selection.
//        switch (item.getItemId()) {
//            case 0:
//                showHelp();
//                Toast.makeText(this, "0", Toast.LENGTH_SHORT).show();
//                return true;
//            case 1:
//                showHelp();
//                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//    void showHelp()
//    {}

//    @SuppressLint("NonConstantResourceId")
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle item selection
//        switch (item.getItemId()) {
//            case R.id.action_settingss:
//                // Code to start a Settings Activity or perform an action
//                return true;
//                break;
//            case R.id.action_adds:
//                // Code to perform an 'add' action
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }

}
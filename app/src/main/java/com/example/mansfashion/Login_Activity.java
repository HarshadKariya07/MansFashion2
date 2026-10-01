package com.example.mansfashion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login_Activity extends AppCompatActivity {

    EditText edtPhone,edtPass;

    TextView txtCreate;
    Button btnLogin;
    private FirebaseAuth mAuth;
// ...
// Initialize Firebase Auth

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        edtPhone=findViewById(R.id.edtPhone);
        edtPass=findViewById(R.id.edtPass);
        btnLogin=findViewById(R.id.btnLogin);
        txtCreate=findViewById(R.id.txtCreate);

        btnLogin.setOnClickListener(v -> {


            mAuth.createUserWithEmailAndPassword(edtPhone.getText().toString(), edtPass.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d("hhhhhh", "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                Intent intent=new Intent(Login_Activity.this, MainActivity.class);
                                startActivity(intent);
                              //  updateUI(user);
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w("fffff", "createUserWithEmail:failure", task.getException());
                                Toast.makeText(Login_Activity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                               // updateUI(null);
                            }
                        }
                    });

        });

        txtCreate.setOnClickListener(v -> {
            Intent intent=new Intent(this,Registration_Activity.class);
            startActivity(intent);
        });
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
           // reload();
        }
    }
}
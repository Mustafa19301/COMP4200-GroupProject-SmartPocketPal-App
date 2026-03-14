package com.example.comp4200_groupproject_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CreateAccountScreenActivity extends AppCompatActivity {
    EditText firstnameview, lastnameview, emailview, phonenumberview, usernameview, passwordview;
    ImageView imagelogoview;
    Button createbutton;
    TextView haveanaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_account_screen);

        firstnameview = findViewById(R.id.firstnameview);
        lastnameview = findViewById(R.id.lastnameview);
        emailview = findViewById(R.id.emailview);
        phonenumberview = findViewById(R.id.phonenumberview);
        usernameview = findViewById(R.id.usernameview);
        passwordview = findViewById(R.id.passwordview);
        imagelogoview = findViewById(R.id.imagelogoview);
        createbutton = findViewById(R.id.createbutton);
        haveanaccount = findViewById(R.id.haveanaccount);

        haveanaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccountScreenActivity.this, LoginScreenActivity.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
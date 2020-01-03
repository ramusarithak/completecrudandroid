package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration_screen);


        Intent intent=getIntent();
        String mess=intent.getStringExtra("Submit");
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(mess+" user register Successfully click login");
        Button login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte=new Intent(RegisterationScreen.this,MainActivity.class);
                inte.putExtra("Button",0);
                startActivity(inte);
            }
        });
    }
}

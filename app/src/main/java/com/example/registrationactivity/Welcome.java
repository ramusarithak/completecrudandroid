package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        Intent intent=getIntent();
        String msg=intent.getStringExtra("login");
        TextView text=(TextView)findViewById(R.id.textView22);
        text.setText("welcome"+msg+"Thank you for logging");

    }
}

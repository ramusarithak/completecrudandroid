package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();
                intent.putExtra("Register",0);
                startActivity(intent);
                EditText email_editText=(EditText)findViewById(R.id.emailEditText);
                EditText password_editText=(EditText)findViewById(R.id.passwordEditText);
                String Email=email_editText.getText().toString();
                String pass=password_editText.getText().toString();

                if(!Email.isEmpty() && !pass.isEmpty()){
                   Intent i=new Intent(MainActivity.this,Welcome.class);
                   i.putExtra("login",Email);
                   startActivity(i);
                }else{
                    Toast.makeText(MainActivity.this,"please correctly fill the user name and password",Toast.LENGTH_LONG).show();
                }
            }
        });
        Button btn1=(Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,Register.class);
                startActivity(intent);

            }
        });


    }
}

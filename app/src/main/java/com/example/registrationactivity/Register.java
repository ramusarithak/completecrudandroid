package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                EditText editText3 = (EditText) findViewById(R.id.editText3);
                EditText editText4 = (EditText) findViewById(R.id.editText4);

                String name = editText1.getText().toString();
                String Email = editText2.getText().toString();
                String password = editText3.getText().toString();
                String confirmpass = editText4.getText().toString();
                if (!password.equals(confirmpass)) {
                    Toast.makeText(Register.this, "password did not match", Toast.LENGTH_LONG).show();
                } else {
                    if (!name.isEmpty() && !Email.isEmpty()) {


                        Intent in = new Intent(Register.this, RegisterationScreen.class);
                        in.putExtra("Submit", name);
                        startActivity(in);
                        finish();
                    }else
                        {
                        Toast.makeText(Register.this,"please correctly fill all field",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}

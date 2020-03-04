package com.kiran.simpleloginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText email,password;
    TextView registrationlink;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.txtEmail);
        password = (EditText) findViewById(R.id.txtPwd);

        registrationlink = (TextView) findViewById(R.id.lnkRegister);

        login = (Button) findViewById(R.id.btnLogin);

        // Calling Registration Activity
        registrationlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registratioPage = new Intent(Login.this,Registration.class);
                startActivity(registratioPage);
            }
        });

        // Checking email and password entered or not
        // Checking entered email is login@login.com and password is 12345 for successful login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().isEmpty() &&
                        password.getText().toString().isEmpty()){
                    Toast.makeText(Login.this,"Enter Email or Password",Toast.LENGTH_SHORT).show();
                }
                else if(email.getText().toString().equals("login@login.com") &&
                            password.getText().toString().equals("12345")){
                    Toast.makeText(Login.this,"Login Successfully",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}

package com.kiran.simpleloginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    EditText name,email,password;
    TextView loginLink;
    Button registration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = (EditText) findViewById(R.id.txtName);
        email = (EditText) findViewById(R.id.txtEmail);
        password = (EditText) findViewById(R.id.txtPwd);

        loginLink = (TextView) findViewById(R.id.lnkLogin);

        registration = (Button) findViewById(R.id.btnRegistration);

        // Calling Login Activity
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(Registration.this,Login.class);
                startActivity(login);
            }
        });

        // Checking name, email and password is entered or not.
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().isEmpty() &&
                        email.getText().toString().isEmpty() &&
                            password.getText().toString().isEmpty()){
                    Toast.makeText(Registration.this,"Enter FullName or Email or Password",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Registration.this,"Registered Successfull",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

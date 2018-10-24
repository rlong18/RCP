package com.example.robertlong.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   // EditText lname, email;
    Button submit;
    Button signup;
    EditText username;
    EditText pass;

    //AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        setContentView(R.layout.activity_main);

        updateUI();
    }

    private void updateUI() {
        // fname = (EditText) findViewById(R.id.fname);
        username = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.pass);
        submit = (Button) findViewById(R.id.submit);
        signup = (Button) findViewById(R.id.signup);


        //awesomeValidation.addValidation(MainActivity.this, R.id.fname, "[a-zA-Z\\s]+", R.string.fnameerr);
        //awesomeValidation.addValidation(MainActivity.this, R.id.username, "[a-zA-Z\\s]+", R.string.lnameerr);
        //awesomeValidation.addValidation(MainActivity.this, R.id.pass, Patterns.EMAIL_ADDRESS, R.string.emailerr);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, signup.class);
                //intent.putExtra("First name", fname.getText().toString());
                intent.putExtra("username", username.getText().toString());
                intent.putExtra("password", pass.getText().toString());
                startActivity(intent);




            }


        });


        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, signup.class);
                startActivity(intent);
            }
        });
    }
}









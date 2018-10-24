package com.example.robertlong.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class home extends AppCompatActivity{
    EditText name;
    EditText email;
    EditText uni;
    EditText bio;



}
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



    }

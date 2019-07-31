package com.example.robertlong.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class home extends AppCompatActivity{
    ImageView pic;
    EditText name;
    EditText email;
    EditText uni;
    EditText bio;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        setContentView(R.layout.homepage);

        updateUI();
    }

    private void updateUI() {
        pic = (ImageView) findViewById(R.id.pic);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        uni = (EditText) findViewById(R.id.uni);
        bio = (EditText) findViewById(R.id.bio);



    }
}
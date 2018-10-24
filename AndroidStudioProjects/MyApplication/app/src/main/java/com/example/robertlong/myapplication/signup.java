package com.example.robertlong.myapplication;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    Button create;
    TextView signup;
    EditText username;
    EditText pass;
    EditText passconfirm;
    EditText email;



    //AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        setContentView(R.layout.signup_page);
        username = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.pass);
        passconfirm = (EditText) findViewById(R.id.passconfirm);
        create = (Button) findViewById(R.id.create);
        email = (EditText) findViewById(R.id.email);

        //updateUI();
    }

//    private void updateUI() {
//        // fname = (EditText) findViewById(R.id.fname);
//        username = (EditText) findViewById(R.id.username);
//        pass = (EditText) findViewById(R.id.pass);
//        passconfirm = (EditText) findViewById(R.id.passconfirm);
//        create = (Button) findViewById(R.id.create);
//        email = (EditText) findViewById(R.id.email);
//    }

    @Override
    protected void onStart() {

        super.onStart();
        //adapter.notifyDataSetChanged();
        //fname.setText(getIntent().getStringExtra("First name"));
        username.setText(getIntent().getStringExtra("username"));
        pass.setText(getIntent().getStringExtra("password"));
        passconfirm.setText(getIntent().getStringExtra("password confirmation"));
        email.setText(getIntent().getStringExtra("password confirmation"));
        Toast.makeText(signup.this, getIntent().getStringExtra("First name"), Toast.LENGTH_SHORT).show();



        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.activity_main);
//                Intent intent = new Intent(signup.this, MainActivity.class);
//                //intent.putExtra("First name", fname.getText().toString());
//                intent.putExtra("username", username.getText().toString());
//                intent.putExtra("password", pass.getText().toString());
//                intent
//                startActivity(intent);




            }


        });

//        mDbHelper = new FeedReaderDbHelper(this);
//        create.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//               // Intent intent = new Intent(.this, MainActivity3.class);
//
//                startActivity(intent);
//            }
//        });
    }
}

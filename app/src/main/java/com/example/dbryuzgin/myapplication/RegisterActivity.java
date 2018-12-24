package com.example.dbryuzgin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button bRegisterR;
    EditText etFirstName, etLastName, etEmailR, etPasswordR, etPasswordRRepeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        etEmailR = (EditText) findViewById(R.id.etEmailR);
        etPasswordR = (EditText) findViewById(R.id.etPasswordR);
        etPasswordRRepeat = (EditText) findViewById(R.id.etPasswordRRepeat);
        bRegisterR = (Button) findViewById(R.id.bRegisterR);

        bRegisterR.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch(v.getId()){
            case R.id.bRegisterR:

                break;
        }
    }
}

package com.example.akshar.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtusername,edtpass;
    Button  btnenter;
    CheckBox checkBox1,checkBox2,checkBox3;
    boolean click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtusername=(EditText)findViewById(R.id.username);
        edtpass=(EditText)findViewById(R.id.password);
        checkBox1=(CheckBox)findViewById(R.id.checkBox1);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
        checkBox3=(CheckBox)findViewById(R.id.checkBox3);
        btnenter=(Button)findViewById(R.id.btninsert);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click=true;

            }
        });checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click=true;
            }
        });checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click=true;
            }
        });
        btnenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(click){
                    Toast.makeText(MainActivity.this, "inser done", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "baki xe bro", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}

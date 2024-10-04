package com.yuvraj.dem0_checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox java, python, asp, bigdata;
    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java = (CheckBox) findViewById(R.id.checkbox1);
        java.setOnClickListener(this);
        python = (CheckBox) findViewById(R.id.checkbox2);
        python.setOnClickListener(this);
        asp = (CheckBox) findViewById(R.id.checkbox3);
        asp.setOnClickListener(this);
        bigdata = (CheckBox) findViewById(R.id.checkbox4);
        bigdata.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        if(java.isChecked()){
            str = java.getText().toString();
        }
        if(python.isChecked()){
            str = python.getText().toString();
        }
        if(asp.isChecked()){
            str = asp.getText().toString();
        }
        if(bigdata.isChecked())
        {
            str = bigdata.getText().toString();
        }
        Toast.makeText(this,str.toString()+"You Select",Toast.LENGTH_SHORT).show();

        }
    }









//Use += Operator for printing All value  str += java.getText().toString();



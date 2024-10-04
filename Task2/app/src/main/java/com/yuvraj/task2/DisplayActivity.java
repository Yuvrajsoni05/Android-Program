package com.yuvraj.task2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {


    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        TextView tx_name = (TextView) findViewById(R.id.tx_name);
        TextView tx_phone = (TextView)findViewById(R.id.tx_phone);
        TextView tx_email = (TextView)findViewById(R.id.tx_email);


        Bundle BD =     getIntent().getExtras();
//        Toast.makeText(this,"Test",Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,BD.getString("name"),Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,BD.getString("phone"),Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,BD.getString("email"),Toast.LENGTH_SHORT).show();


        tx_name.setText(BD.getString("name"));
        tx_email.setText(BD.getString("email"));
        tx_phone.setText(BD.getString("phone"));



    }
}

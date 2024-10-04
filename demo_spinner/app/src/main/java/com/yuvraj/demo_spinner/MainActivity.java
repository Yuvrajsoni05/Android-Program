package com.yuvraj.demo_spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] bank = {"BOI","SBI","HDFC","PNB","OBC"};
    int[] flag = {R.drawable.a1,R.drawable.a1,R.drawable.a1,R.drawable.a1,R.drawable.a1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);


        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item,bank);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(ad);





    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1,int position,long id)
    {
        Toast.makeText(getApplicationContext(),bank[position],Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0)
    {

    }
}
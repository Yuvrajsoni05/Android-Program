package com.yuvraj.demo_autocomplete;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String[] NameList = {"Drashti","Nihal","Meet","Krisha"} ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        AutoCompleteTextView simpleAuto = (AutoCompleteTextView) findViewById(R.id.simple_auto);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,NameList);


        simpleAuto.setAdapter(adapter);
        simpleAuto.setThreshold(1);
        simpleAuto.setAdapter(adapter);



    }
}
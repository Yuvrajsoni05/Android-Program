package com.yuvraj.demo_arrayadapter;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String frd[] = {"Yuvraj","Drashti","Nihal","Krisha" ,"Ishita"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        simpleList =  (ListView) findViewById(R.id.simpleListview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.activity_listview,R.id.textView,frd);
        simpleList.setAdapter(arrayAdapter);



    }
}
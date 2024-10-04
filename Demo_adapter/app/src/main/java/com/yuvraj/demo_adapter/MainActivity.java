package com.yuvraj.demo_adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView simpleListView;
    String [] fruitNames = {"Apple","PineApple","Orange"};
    int[] fruitsImage = {R.drawable.apple,R.drawable.pinaple,R.drawable.orange};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        simpleListView = (ListView) findViewById(R.id.simpleListView);


        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        for (int i = 0; i<fruitNames.length; i++)
        {
            HashMap<String,String> hashMap=new HashMap<>();

            hashMap.put("name",fruitNames[i]);
            hashMap.put("image",fruitsImage[i]+"");
            arrayList.add(hashMap);


        }
        String[] from={"name","image"};
        int[] to = {R.id.textView,R.id.imageView};
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,arrayList,R.layout.list_view_items,from,to);
        simpleListView.setAdapter(simpleAdapter);

        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i , long l) {
                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
            }
        });

    }
}
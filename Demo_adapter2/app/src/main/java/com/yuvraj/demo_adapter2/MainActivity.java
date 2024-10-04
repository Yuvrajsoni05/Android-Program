package com.yuvraj.demo_adapter2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {
    ListView simpleList;
    String countryList[] = {"India", "Germany", "russia", "uk",};
    int flags[] = {R.drawable.india, R.drawable.germany, R.drawable.uk,R.drawable.russia};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);




        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList,flags);
        simpleList.setAdapter(customAdapter);

    }
}
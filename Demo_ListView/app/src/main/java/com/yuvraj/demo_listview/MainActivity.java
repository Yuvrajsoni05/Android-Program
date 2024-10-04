package com.yuvraj.demo_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sample data to display in the ListView
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

        // Find the ListView in the layout
        ListView listView = findViewById(R.id.listView);

        // Create an ArrayAdapter to bind the data to the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,                    // Context
                android.R.layout.simple_list_item_1, // Layout for each item
                data                     // Data to be displayed
        );

        // Set the adapter to the ListView
        listView.setAdapter(adapter);

        // Set an item click listener to show a Toast message when an item is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the clicked item
                String clickedItem = (String) parent.getItemAtPosition(position);

                // Show a Toast message with the clicked item
                Toast.makeText(MainActivity.this, "Clicked: " + clickedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.khushi.demonavigation;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DisplayActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_display);

      TextView tvUname=(TextView)findViewById(R.id.tv_UName);

        TextView tvPhone=(TextView)findViewById(R.id.tv_Phone);

         Bundle bd=getIntent().getExtras();
        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, bd.getString("name"), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, bd.getString("Phone"), Toast.LENGTH_SHORT).show();

        tvUname.setText(bd.getString("name"));
        tvPhone.setText(bd.getString("Phone"));
    }
}
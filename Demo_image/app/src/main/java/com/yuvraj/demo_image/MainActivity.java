package com.yuvraj.demo_image;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {
//    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        image = (ImageView) findViewById(R.id.image);
//        image.setBackgroundColor(Color.BLACK);
     ImageButton simpleImageButton = (ImageButton) findViewById(R.id.simple);

     simpleImageButton.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View view){
             Toast.makeText(getApplicationContext(),"YouTube",Toast.LENGTH_LONG).show();
         }
     });


    }
}
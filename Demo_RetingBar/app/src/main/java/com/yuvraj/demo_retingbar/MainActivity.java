package com.yuvraj.demo_retingbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingBar simpleRating = (RatingBar) findViewById(R.id.R1);
        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String total_star = "Total Star :: " +simpleRating.getNumStars();
                String rating = "Rating :: "+simpleRating.getRating();
                Toast.makeText(getApplicationContext(),total_star+"\n"+rating,Toast.LENGTH_LONG).show();

            }
        });


    }
}
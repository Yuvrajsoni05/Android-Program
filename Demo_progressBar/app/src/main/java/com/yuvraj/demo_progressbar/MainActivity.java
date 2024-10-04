package com.yuvraj.demo_progressbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

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

        final ProgressBar simpleProgress = (ProgressBar) findViewById(R.id.progrss);
        Button StartButton = (Button) findViewById(R.id.startButton);
        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleProgress.setVisibility(View.VISIBLE);
            }
        });



    }
}
// startButton.setOnClickListener(new View.OnClickListener() {
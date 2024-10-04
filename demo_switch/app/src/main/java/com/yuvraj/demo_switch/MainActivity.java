package com.yuvraj.demo_switch;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Switch  switch1,switch2;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = (Switch) findViewById(R.id.switch1);
        switch2 = (Switch) findViewById(R.id.switch2);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1,s2;
                if(switch1.isChecked())
                    s1 = switch1.getTextOn().toString();
                else
                    s1 = switch1.getTextOff().toString();
                if(switch2.isChecked())
                    s2 = switch1.getTextOn().toString();
                else
                    s2 = switch1.getTextOff().toString();

                Toast.makeText(getApplicationContext(),"Switch1 : "+s1+"\n"+"Switch2 :"+s2, Toast.LENGTH_LONG).show();

            }
        });


    }
}
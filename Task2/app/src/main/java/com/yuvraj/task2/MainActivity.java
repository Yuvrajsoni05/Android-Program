package com.yuvraj.task2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText et_name;
    EditText et_phone;
    EditText et_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = (EditText) findViewById(R.id.et_name);
        et_phone = (EditText) findViewById(R.id.et_email);
        et_email = (EditText) findViewById(R.id.et_phone);

        };


        public void onClick(View view){
            Intent intent = new Intent(this,DisplayActivity.class);
            Bundle extras = new Bundle();
            extras.putString("name",et_name.getText().toString());
            extras.putString("phone",et_phone.getText().toString());
            extras.putString("email",et_email.getText().toString());
            intent.putExtras(extras);

            startActivity(intent,extras);

        }

    }

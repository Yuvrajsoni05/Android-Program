package com.khushi.demonavigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {

    EditText et_UserName;
    EditText et_Phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_UserName=(EditText) findViewById(R.id.txt_Uname);
        et_Phone=(EditText) findViewById(R.id.txt_Phone);


    }

    public void onClick(View view){
       // Toast.makeText(this, et_UserName.getText().toString(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DisplayActivity.class);
        //startActivity(intent);
        Bundle extras = new Bundle();
        extras.putString("name",et_UserName.getText().toString());
        extras.putString("Phone",et_Phone.getText().toString());
        intent.putExtras(extras);

        startActivity(intent,extras);

    }


}
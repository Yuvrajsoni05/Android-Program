package com.yuvraj.secondproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {
    int request_Code = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }
        public void onClick(View view)
        {

            startActivityForResult(new Intent("com.yuvraj.secondproject.SecondActivity"),request_Code);
        }
        public void onActivityResult(int requestCode,int resultCode,Intent data)
        {
            if (requestCode == request_Code)
            {
                if (resultCode == RESULT_OK)
                {
                    Toast.makeText(this,data.getData().toString(),Toast.LENGTH_SHORT).show();
                }
            }
        }
}


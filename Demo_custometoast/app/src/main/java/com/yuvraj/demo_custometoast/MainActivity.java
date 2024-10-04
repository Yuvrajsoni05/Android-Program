package com.yuvraj.demo_custometoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button simpleToast , customToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleToast = (Button) findViewById(R.id.simpleToast);
        customToast = (Button) findViewById(R.id.customToast);

        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Simple Toast In Android",Toast.LENGTH_LONG);toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL,0,0);
                toast.show();
            }
        });
        customToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custome_toast_layout,(ViewGroup)findViewById(R.id.toast_layout_root));
                TextView toastTextView = (TextView) layout.findViewById(R.id.toastTextView);
                ImageView toastImageView = (ImageView) layout.findViewById(R.id.toastImageView);
                toastTextView.setText("Custom Toast In Android");
                toastImageView.setImageResource(R.drawable.ic_launcher_foreground);
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
    }
}


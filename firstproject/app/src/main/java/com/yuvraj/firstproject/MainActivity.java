package com.yuvraj.firstproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends Activity {

    String tag = "Life Cycle step";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.d(tag,"In The onCreate() event");
        }
        public void onStart ()
        {
            super.onStart();
            Log.d(tag,"In the OnStart() Event");
        }
        public void onRestart ()
        {
            super.onRestart();
            Log.d(tag,"In The onRestart() Event");
        }

        public void onResume()
        {
            super.onResume();;
            Log.d(tag, "In The OnResume()  Event");
        }

        public void onPause()
        {
            super.onPause();
            Log.d(tag," In The onPause()  event ");
        }


        public void onStop()
        {
            super.onStop();
            Log.d(tag," In The onStop()  event ");
        }


        public void onDestroy()
        {
            super.onDestroy();
            Log.d(tag," In The onDestroy()  event ");
        }
    }

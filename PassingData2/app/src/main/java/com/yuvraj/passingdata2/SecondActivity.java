package com.yuvraj.passingdata2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class SecondActivity  extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(this,getIntent().getStringExtra("str1"),Toast.LENGTH_SHORT).show();
        Toast.makeText(this,Integer.toString(getIntent().getIntExtra("age1",0)),Toast.LENGTH_SHORT).show();


        Bundle bundle = getIntent().getExtras();

        Toast.makeText(this,bundle.getString("str2"),Toast.LENGTH_SHORT).show();
        Toast.makeText(this,Integer.toString(getIntent().getIntExtra("age2",0)),Toast.LENGTH_SHORT).show();

    }
    public void onclick(View view)
    {
        Intent i = new Intent();
        i.putExtra("age3",45);
        i.setData(Uri.parse("somthing Wrong"));
        setResult(RESULT_OK,i);
        finish();
    }

}

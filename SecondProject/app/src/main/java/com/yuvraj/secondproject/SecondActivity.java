package com.yuvraj.secondproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
hello
public class SecondActivity extends Activity {
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.secondactivity);
    }
    public void onClick(View view)
    {
        Intent data = new Intent();
        EditText txt_username = (EditText)findViewById(R.id.txtUsername);
        EditText txt_email = (EditText)findViewById(R.id.txtEmail);
        EditText txt_phone = (EditText)findViewById(R.id.txtPhone);

        data.setData(Uri.parse(txt_username.getText().toString()));
        data.setData(Uri.parse(txt_email.getText().toString()));
        data.setData(Uri.parse(txt_phone.getText().toString()));
        setResult(RESULT_OK,data);
        finish();

    }
}

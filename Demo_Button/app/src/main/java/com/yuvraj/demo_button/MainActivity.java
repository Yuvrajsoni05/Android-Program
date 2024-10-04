package com.yuvraj.demo_button;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button submit;
    RatingBar Rating;
    RadioButton male,female;
    String select;

    EditText name,password,email,date,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.editText2);
        email = (EditText) findViewById(R.id.editText3);
        date = (EditText) findViewById(R.id.editText4);
        contact =(EditText) findViewById(R.id.editText5);
        Rating = (RatingBar) findViewById(R.id.R1);

        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton)findViewById(R.id.female);

        submit = (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty() ||
                        password.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||

                        date.getText().toString().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter The Data",Toast.LENGTH_SHORT).show();
                    }
                else {
                    String total_star = "Total Star :: "+Rating.getNumStars();
                    String rating = "Rating :: "+Rating.getRating();
                    String name1 = "Name  " +name.getText().toString();
                    String Phone = "Phone  "+contact.getText().toString();
                    if (male.isChecked()){
                        select = "Gender :: "+male.getText().toString();
                    } else if (female.isChecked()) {
                        select = "Gender :: "+female.getText().toString();
                    }
                    Toast.makeText(getApplicationContext(),name1+"\n"+"Password - "
                            +password.getText().toString()+ " \n" + "E-Mail -  " + email.getText().toString() + " \n" +
                            "Date -  " + date.getText().toString()+"\n" +Phone+"\n"+ select +"\n"+rating,Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}
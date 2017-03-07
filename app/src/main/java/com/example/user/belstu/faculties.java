package com.example.user.belstu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class faculties extends AppCompatActivity implements View.OnClickListener{

    Button button2_1;
    Button button2_2;
    Button button2_3;
    Button button2_4;
    Button button2_5;
    Button button2_6;
    Button button2_7;
    Button button2_8;
    Button button2_9;
    Button button2_10;
    Button button2_11;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculties);

        button2_1 = (Button) findViewById(R.id.button2_1);
        button2_2 = (Button) findViewById(R.id.button2_2);
        button2_3 = (Button) findViewById(R.id.button2_3);
        button2_4 = (Button) findViewById(R.id.button2_4);
        button2_5 = (Button) findViewById(R.id.button2_5);
        button2_6 = (Button) findViewById(R.id.button2_6);
        button2_7 = (Button) findViewById(R.id.button2_7);
        button2_8 = (Button) findViewById(R.id.button2_8);
        button2_9 = (Button) findViewById(R.id.button2_9);
        button2_10 = (Button) findViewById(R.id.button2_10);
        button2_11 = (Button) findViewById(R.id.button2_11);

        button2_1.setOnClickListener(this);
        button2_2.setOnClickListener(this);
        button2_3.setOnClickListener(this);
        button2_4.setOnClickListener(this);
        button2_5.setOnClickListener(this);
        button2_6.setOnClickListener(this);
        button2_7.setOnClickListener(this);
        button2_8.setOnClickListener(this);
        button2_9.setOnClickListener(this);
        button2_10.setOnClickListener(this);
        button2_11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button2_1:
                Intent intent = new Intent(this, les.class);
                startActivity(intent); break;
            case R.id.button2_2:
                intent = new Intent(this, ttlp.class);
                startActivity(intent); break;
            case R.id.button2_3:
                intent = new Intent(this, tov.class);
                startActivity(intent); break;
            case R.id.button2_4:
                intent = new Intent(this, htit.class);
                startActivity(intent); break;
            case R.id.button2_5:
                intent = new Intent(this, idip.class);
                startActivity(intent); break;
            case R.id.button2_6:
                intent = new Intent(this, iaf.class);
                startActivity(intent); break;
            case R.id.button2_7:
                intent = new Intent(this, fit.class);
                startActivity(intent); break;
            case R.id.button2_8:
                intent = new Intent(this, zaoch.class);
                startActivity(intent); break;
            case R.id.button2_9:
                intent = new Intent(this, obch_prof.class);
                startActivity(intent); break;
            case R.id.button2_10:
                intent = new Intent(this, douniver.class);
                startActivity(intent); break;
            case R.id.button2_11:
                intent = new Intent(this, rab_s_in_stud.class);
                startActivity(intent); break;
        }
    }

}

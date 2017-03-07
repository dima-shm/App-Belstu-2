package com.example.user.belstu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class raspisanie1 extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raspisnie1);

        button1 = (Button) findViewById(R.id.button2_1);
        button2 = (Button) findViewById(R.id.button2_2);
        button3 = (Button) findViewById(R.id.button2_3);
        button4 = (Button) findViewById(R.id.button2_4);
        button5 = (Button) findViewById(R.id.button2_5);
        button6 = (Button) findViewById(R.id.button2_6);
        button7 = (Button) findViewById(R.id.button2_7);
        button8 = (Button) findViewById(R.id.button2_8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button2_1:
                Intent intent = new Intent(this, raspisanie1_1.class);
                startActivity(intent); break;
            case R.id.button2_2:
                intent = new Intent(this, raspisanie1_2.class);
                startActivity(intent); break;
            case R.id.button2_3:
                intent = new Intent(this, raspisanie1_3.class);
                startActivity(intent); break;
            case R.id.button2_4:
                intent = new Intent(this, raspisanie1_4.class);
                startActivity(intent); break;
            case R.id.button2_5:
                intent = new Intent(this, raspisanie1_5.class);
                startActivity(intent); break;
            case R.id.button2_6:
                intent = new Intent(this, raspisanie1_6.class);
                startActivity(intent); break;
            case R.id.button2_7:
                intent = new Intent(this, raspisanie1_7.class);
                startActivity(intent); break;
            case R.id.button2_8:
                intent = new Intent(this, raspisanie1_8.class);
                startActivity(intent); break;
        }
    }

}

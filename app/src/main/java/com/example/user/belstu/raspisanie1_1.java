package com.example.user.belstu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class raspisanie1_1 extends AppCompatActivity implements View.OnClickListener{

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raspisanie1_1);

        button1 = (Button) findViewById(R.id.button4_1);
        button2 = (Button) findViewById(R.id.button4_2);
        button3 = (Button) findViewById(R.id.button4_3);
        button4 = (Button) findViewById(R.id.button4_4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button4_1:
               // Intent intent = new Intent(this, raspisanie1_1.class);
               // startActivity(intent); break;
            case R.id.button4_2:
               // intent = new Intent(this, raspisanie1_2.class);
               // startActivity(intent); break;
            case R.id.button4_3:
               // intent = new Intent(this, raspisanie1_3.class);
               // startActivity(intent); break;
            case R.id.button4_4:
               // intent = new Intent(this, raspisanie1_4.class);
               // startActivity(intent); break;
        }
    }

}

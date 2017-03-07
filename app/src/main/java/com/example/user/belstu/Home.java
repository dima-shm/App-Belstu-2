package com.example.user.belstu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Home extends AppCompatActivity implements View.OnClickListener
{

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glav);

        button1 = (Button) findViewById(R.id.button0_1);
        button2 = (Button) findViewById(R.id.button0_2);
        button3 = (Button) findViewById(R.id.button0_3);
        button4 = (Button) findViewById(R.id.button0_4);
        button5 = (Button) findViewById(R.id.button0_5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button0_1:
                Intent intent = new Intent(this, news.class);
                startActivity(intent); break;
            case R.id.button0_2:
                intent = new Intent(this, faculties.class);
                startActivity(intent); break;
            case R.id.button0_3:
                intent = new Intent(this, gallery.class);
                startActivity(intent); break;
            case R.id.button0_4:
                intent = new Intent(this, raspisanie1.class);
                startActivity(intent); break;
            case R.id.button0_5:
                intent = new Intent(this, kontakti.class);
                startActivity(intent); break;
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.user.belstu/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.user.belstu/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

}

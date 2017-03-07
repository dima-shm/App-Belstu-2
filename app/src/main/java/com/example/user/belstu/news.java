package com.example.user.belstu;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class news extends AppCompatActivity
{
    public Elements content;
    public ArrayList<String> titleList = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_1);

        lv1 = (ListView) findViewById(R.id.ListView1);
        new NewThread().execute();
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.pro_item, titleList);
    }

    public class NewThread extends AsyncTask<String, Void, String>
    {
        @Override
        protected String doInBackground(String... arg)
        {
            Document doc1;

            try
            {
                doc1 = Jsoup.connect("http://www.belstu.by/news.html?list=20&filter=1").get();
                content = doc1.select(".TitleRef");

                titleList.clear();
                for (Element contents: content)
                {
                    titleList.add(contents.text());
                }
            }catch (IOException e)
            {
                e.printStackTrace();
            }
            return null;
        }
        @Override
        protected void onPostExecute(String results)
        {
            lv1.setAdapter(adapter);
        }

    }
}

package com.example.digitaltajbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class newActivity2 extends AppCompatActivity {

    WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://docs.google.com/document/d/11f40chvoZrV52urSYzLqyrwJbse7PZdBqPjs2zE0IFM/edit");


    }
}
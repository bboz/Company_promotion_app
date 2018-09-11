package com.example.baris.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;



public class ActivitySix extends AppCompatActivity {
    WebView v;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        v=(WebView) findViewById(R.id.webviewmap);
        String html="<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3011.393868819288!2d28.666042414808597!3d40.99475162820714!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x14b55f8609629c81%3A0x577bf9ce24d83b67!2s%C3%87uhadaro%C4%9Flu+Metal+San.+Ve+Paz.+A.%C5%9E!5e0!3m2!1str!2str!4v1533391793680\" width=\"100%\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>";
        v.getSettings().setJavaScriptEnabled(true);
        v.loadData(html,"text/html",null);
    }
}

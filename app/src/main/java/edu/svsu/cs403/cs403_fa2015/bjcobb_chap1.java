package edu.svsu.cs403.cs403_fa2015;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.TextView;

public class bjcobb_chap1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bjcobb_chap1);
        String html = getResources().getString(R.string.CIS_Web);
        String mime = "text/html";
        String encoding = "utf-8";

        WebView myWebView = (WebView)this.findViewById(R.id.webView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadDataWithBaseURL(null, html, mime, encoding, null);
        Log.d("DEBUG", "onCreate was just called!");
    }

    protected void onResume() {
        super.onResume();
        Log.d("DEBUG", "onResume was just called!");
    }

    protected void onPause() {
        super.onPause();
        Log.d("DEBUG", "onPause was just called!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_selector, menu);
        return true;
    }

}
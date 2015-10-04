package edu.svsu.cs403.cs403_fa2015;


import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by zmmetiva on 10/3/15.
 */
public class zmmetiva_chap3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zmmetiva_chap3);
        // gpcorser20150916: code for scrolling
        WebView webView = (WebView) findViewById(R.id.zmmetiva_webView3);

        String summary = "<html><body><p>Regional employers attract others, like:</p>" +
                "<ul>\n<li>Auto Owners Insurance</li>\n" +
                "<li>Frankenmuth Mutual Insurance</li>\n" +
                "<li>Covenant Healthcare</li>\n" +
                "<li>Rehmann Group</li>\n" +
                "<li>McLaren Health Care Corporation</li>\n" +
                "<li>Ascension Health</li>\n" +
                "<li>Yeo &amp; Yeo</li>\n" +
                "<li>...among others</li>\n" +
                "</ul></body></html>";

        webView.loadData(summary, "text/html", null);

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

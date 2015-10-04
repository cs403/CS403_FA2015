package edu.svsu.cs403.cs403_fa2015;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class zmmetiva_chap1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zmmetiva_chap1);

        WebView webView = (WebView) findViewById(R.id.zmmetiva_webView1);

        String summary = "<html><body>Some students go on to complete graduate work and earn master" +
                "&#39;s degrees and Ph.D.s. Our programs prepare students for grad school if that&#39;s " +
                "what they are interested in. Many have pursued graduate degrees at institutions " +
                "in the state such as Michigan State University, Oakland University, The University " +
                "of Michigan and Central Michigan University. Others have gone on to schools in " +
                "other states and done very well.</body></html>";

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
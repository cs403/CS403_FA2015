package edu.svsu.cs403.cs403_fa2015;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.webkit.WebView;

/**
 * This class handles the functionality for my second submenu in the CSIS app.
 */
public class tpmetiva_chap2 extends AppCompatActivity {

    /**
     * Implements the overridden onCreate method from the AppCombatActivity super class.
     * This method loads all HTML needed to display information relevant to IEEE.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        // Call parent method and set content
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tpmetiva_chap2);

        // Instantiate WebView object
        WebView webView = (WebView) findViewById(R.id.wvIeee);

        // HTML needed for display purposes
        String html = "<html><body style='font-size:20px;'><ul>\n" +
                "<li>The IEEE Student Branch President</li>\n" +
                "<li>The IEEE Student Branch Faculty Counselor</li>\n" +
                "<li>The Chairperson of the EE Department.</li>\n" +
                "</ul></body></html>";

        // Populate WebView with HTML
        webView.loadData(html, "text/html", null);

        Log.d("DEBUG", "onCreate was just called!");
    }

    /**
     * This method handles app resume.
     */
    protected void onResume() {
        // Call parent method
        super.onResume();
        Log.d("DEBUG", "onResume was just called!");
    }

    /**
     * This method handles app pause.
     */
    protected void onPause() {
        // Call parent method
        super.onPause();
        Log.d("DEBUG", "onPause was just called!");
    }

    /**
     * This method creates the applications menu bar.
     *
     * @param menu
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_selector, menu);
        return true;
    }
}

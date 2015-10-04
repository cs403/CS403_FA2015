package edu.svsu.cs403.cs403_fa2015;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.webkit.WebView;

/**
 * This class handles all functionality for my third submenu activity in the CSIS application.
 */
public class tpmetiva_chap3 extends AppCompatActivity {

    /**
     * Implements the overidden onCreate method from the AppCombatActivity super class.
     * This method loads all HTML needed to display information relevant to Cardinal Bitcoiners.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Call parent method and set content
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tpmetiva_chap3);

        // Instantiate WebView object
        WebView webView = (WebView) findViewById(R.id.wvBitcoiners);

        // HTML needed for display purposes
        String html = "<html><body style='font-size:22px;'><br/><ul>\n" +
                "        <li><strong>Description: </strong>Emerging technologies are fields of technology that broach new territory in some significant way, with new technological developments. Examples of currently emerging technologies include autonomous cars, parallel computing/super computing, computer/informational security, artificial intelligence, robotics, virtual reality, and much more.\n" +
                "\n" +
                "The purpose of E.T is to help people exchange ideas and resources more freely through the advocation of emerging technology, emerging technology research, and the development of new technology.\n" +
                "\n" +
                "This includes, increasing understanding and awareness about emerging technology throughout the student body, fostering project growth through exchanging ideas and resources, integrating with the Mid-Michigan community, meeting up with other college organizations around Michigan, performing philanthropic functions, joining coding competitions (known as hackathons) and creating valuable networking opportunities. \n" +
                "</li><br/>\n" +
                "        <li id=\"org_popup_keywords\"><strong>Keywords: </strong><ul class=\"org_keywords\"><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Computer Science</li><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Computer Informational Systems</li><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Emerging Technology</li><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Hardware</li><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Computing</li><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Research</li><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Competitions</li><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Robotics</li><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Artificial Intelligence</li><li class=\"org_keyword_item \" loading=\"$j.fancybox.close()\">Virtual Reality</li><li class=\"org_keyword_item last\" loading=\"$j.fancybox.close()\">Computer Security</li></ul></li>\n" +
                "      </ul>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div id=\"profile_for_org\">\n" +
                "      <ul>\n" +
                "        \n" +
                "          <li>\n" +
                "            <strong>Description of Organization: </strong>\n" +
                "            \n" +
                "              <p>Emerging technologies are fields of technology that broach new territory in some significant way, with new technological developments. Examples of currently emerging technologies include autonomous cars, parallel computing/super computing, computer/informational security, artificial intelligence, robotics, virtual reality, and much more.</p>\n" +
                "\n" +
                "<p>The purpose of E.T is to help people exchange ideas and resources more freely through the advocation of emerging technology, emerging technology research, and the development of new technology.</p>\n" +
                "\n" +
                "  </div></body></html>";

        // Populate HTML in WebView
        webView.loadData(html, "text/html", null);

        Log.d("DEBUG", "onCreate was just called!");
    }

    /**
     * This method handles app resume.
     */
    protected void onResume() {
        // Call method from parent
        super.onResume();
        Log.d("DEBUG", "onResume was just called!");
    }

    /**
     * This method handles app pause.
     */
    protected void onPause() {
        // Call method from parent
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

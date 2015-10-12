package edu.svsu.cs403.cs403_fa2015;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

/**
 * This class handles all functionality for my first submenu activity in the CSIS application.
 */
public class tpmetiva_chap1 extends AppCompatActivity {

    /**
     * Implements the overidden onCreate method from the AppCombatActivity super class.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Call parent method and set content
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tpmetiva_chap1);

        Log.d("DEBUG", "onCreate was just called!");
    }

    /**
     * This method handles app resume.
     */
    protected void onResume() {
        super.onResume();
        Log.d("DEBUG", "onResume was just called!");
    }

    /**
     * This method handles app pause.
     */
    protected void onPause() {
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

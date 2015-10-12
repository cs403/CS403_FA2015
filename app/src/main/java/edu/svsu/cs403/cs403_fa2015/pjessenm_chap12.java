/*
    Author: Phil Essenmacher
    Date Modified: 10.4.15
    Purpose:  This class is used to create and manage the behavior of chapter 12 of the SVSU CSIS
        class app.
 */

package edu.svsu.cs403.cs403_fa2015;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import android.app.Activity;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.Menu;
    import android.widget.ExpandableListView;


    public class pjessenm_chap12 extends Activity {

        pjessenm_ExpandableListAdapter listAdapter;
        ExpandableListView expListView;
        List<String> listDataHeader;
        HashMap<String, List<String>> listDataChild;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pjessenm_chap12);

            // get the listview
            expListView = (ExpandableListView) findViewById(R.id.lvExp);

            // preparing list data
            prepareListData();

            listAdapter = new pjessenm_ExpandableListAdapter(this, listDataHeader, listDataChild);

            // setting list adapter
            expListView.setAdapter(listAdapter);
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

        /*
         * Preparing the list data
         */
        private void prepareListData() {
            listDataHeader = new ArrayList<>();
            listDataChild = new HashMap<>();

            // Adding child data
            listDataHeader.add("1. Computing is part of everything we do!");
            listDataHeader.add("2. Expertise in computing enables you to solve complex, challenging problems.");
            listDataHeader.add("3. Computing enables you to make a positive difference in the world.");
            listDataHeader.add("4. Computing offers many types of lucrative careers.");
            listDataHeader.add("5. Computing jobs are here to stay, regardless of where you are located.");
            listDataHeader.add("6. Expertise in computing helps you even if your primary career choice is something else.");
            listDataHeader.add("7. Computing offers great opportunities for true creativity and innovativeness.");
            listDataHeader.add("8. Computing has space for both collaborative work and individual effort.");
            listDataHeader.add("9. Computing is an essential part of well-rounded academic preparation.");
            listDataHeader.add("10. Future opportunities in computing are without boundaries.");

            // Adding child data
            List<String> txt1 = new ArrayList<>();
            txt1.add(getResources().getString(R.string.txt1));
            List<String> txt2 = new ArrayList<>();
            txt2.add(getResources().getString(R.string.txt2));
            List<String> txt3 = new ArrayList<>();
            txt3.add(getResources().getString(R.string.txt3));
            List<String> txt4 = new ArrayList<>();
            txt4.add(getResources().getString(R.string.txt4));
            List<String> txt5 = new ArrayList<>();
            txt5.add(getResources().getString(R.string.txt5));
            List<String> txt6 = new ArrayList<>();
            txt6.add(getResources().getString(R.string.txt6));
            List<String> txt7 = new ArrayList<>();
            txt7.add(getResources().getString(R.string.txt7));
            List<String> txt8 = new ArrayList<>();
            txt8.add(getResources().getString(R.string.txt8));
            List<String> txt9 = new ArrayList<>();
            txt9.add(getResources().getString(R.string.txt9));
            List<String> txt10 = new ArrayList<>();
            txt10.add(getResources().getString(R.string.txt10));

            // Header, Child data
            listDataChild.put(listDataHeader.get(0), txt1);
            listDataChild.put(listDataHeader.get(1), txt2);
            listDataChild.put(listDataHeader.get(2), txt3);
            listDataChild.put(listDataHeader.get(3), txt4);
            listDataChild.put(listDataHeader.get(4), txt5);
            listDataChild.put(listDataHeader.get(5), txt6);
            listDataChild.put(listDataHeader.get(6), txt7);
            listDataChild.put(listDataHeader.get(7), txt8);
            listDataChild.put(listDataHeader.get(8), txt9);
            listDataChild.put(listDataHeader.get(9), txt10);
        }
}

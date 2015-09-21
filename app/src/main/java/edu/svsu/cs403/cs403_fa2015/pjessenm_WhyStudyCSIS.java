package edu.svsu.cs403.cs403_fa2015;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import android.app.Activity;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.Menu;
    import android.view.View;
    //import android.widget.ExpandableListAdapter;
    import android.widget.ExpandableListView;
    import android.widget.ExpandableListView.OnChildClickListener;
    import android.widget.ExpandableListView.OnGroupClickListener;
    import android.widget.ExpandableListView.OnGroupCollapseListener;
    import android.widget.ExpandableListView.OnGroupExpandListener;
    import android.widget.Toast;

    public class pjessenm_WhyStudyCSIS extends Activity {

        ExpandableListAdapter listAdapter;
        ExpandableListView expListView;
        List<String> listDataHeader;
        HashMap<String, List<String>> listDataChild;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pjessenm_why_study_csis);

            // get the listview
            expListView = (ExpandableListView) findViewById(R.id.lvExp);

            // preparing list data
            prepareListData();

            listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

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
            listDataHeader = new ArrayList<String>();
            listDataChild = new HashMap<String, List<String>>();

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
            List<String> txt1 = new ArrayList<String>();
            txt1.add(getResources().getString(R.string.txt1));
            List<String> txt2 = new ArrayList<String>();
            txt2.add("Computing is a discipline that offers rewarding and challenging possibilities for a wide range of people regardless of their range of interests. Computing requires and develops capabilities in solving deep, multidimensional problems requiring imagination and sensitivity to a variety of concerns.");
            List<String> txt3 = new ArrayList<String>();
            txt3.add("Computing drives innovation in the sciences (human genome project, AIDS vaccine research, environmental monitoring and protection just to mention a few), and also in engineering, business, entertainment and education. If you want to make a positive difference in the world, study computing.");
            List<String> txt4 = new ArrayList<String>();
            txt4.add("Computing jobs are among the highest paid and have the highest job satisfaction. Computing is very often associated with innovation, and developments in computing tend to drive it. This, in turn, is the key to national competitiveness. The possibilities for future developments are expected to be even greater than they have been in the past.");
            List<String> txt5 = new ArrayList<String>();
            txt5.add("There actually are more computing jobs than qualified people to fill them in the United States. U.S. IT employment was 17% higher in 2004 than in 1999. The Bureau of Labor Statistics says computing has the greatest potential for new jobs through 2018. Yes, some IT jobs have gone overseas. If you consider the expected growth in computing, it’s easy to see that companies simply need more talent. Don’t miss out on pursuing the large number of open positions available right now, here in the United States expected to be even greater than they have been in the past.");
            List<String> txt6 = new ArrayList<String>();
            txt6.add("Having a computing major will provide you with a foundation of knowledge, problem solving and logical thinking that will serve as a competitive advantage to you in your career, in whatever field you choose. ");
            List<String> txt7 = new ArrayList<String>();
            txt7.add("Creating high-quality computing solutions is a highly creative activity, and computing supports creative work in many other fields. The best solutions in computing exhibit high levels of elegance and beauty. ");
            List<String> txt8 = new ArrayList<String>();
            txt8.add("Computing is often about being part of a team that requires people with many different kinds of skills. Yet there is also plenty of space for individual flair and imagination.");
            List<String> txt9 = new ArrayList<String>();
            txt9.add("An increasing number of universities and employers see successful completion of a computer science course as a sign of academic well-roundedness.");
            List<String> txt10 = new ArrayList<String>();
            txt10.add("Computing is one of those fields where it is almost impossible to predict what will happen next. This is why we cannot even begin to imagine all the ways that you can make a contribution to it and it can make your life’s work exciting and real.\n" +
                    "\n" +
                    "This list comes from computingcareers.acm.org.  Please visit this site if you want additional information about why you should consider a career in this field.");

            listDataChild.put(listDataHeader.get(0), txt1); // Header, Child data
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

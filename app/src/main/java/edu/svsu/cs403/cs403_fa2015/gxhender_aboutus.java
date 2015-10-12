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

public class gxhender_aboutus extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gxhender_aboutus);

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
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        // Adding child data
        String[] headers = getResources().getStringArray(R.array.AboutUsArray);
        listDataHeader.add(headers[0]);
        listDataHeader.add(headers[1]);
        listDataHeader.add(headers[2]);
        listDataHeader.add(headers[3]);
        listDataHeader.add(headers[4]);
        listDataHeader.add(headers[5]);
        listDataHeader.add(headers[6]);
        listDataHeader.add(headers[7]);
        listDataHeader.add(headers[8]);
        listDataHeader.add(headers[9]);

        // Adding child data
        //String aboutUs =
        List<String> txt1 = new ArrayList<>();
        txt1.add(getResources().getString(R.string.AboutUs));
        List<String> txt2 = new ArrayList<>();
        txt2.add(getResources().getString(R.string.QualityInstruction) );
        List<String> txt3 = new ArrayList<>();
        txt3.add(getResources().getString(R.string.CapstoneProjects));
        List<String> txt4 = new ArrayList<>();
        txt4.add(getResources().getString(R.string.ComputerLaboratories));
        List<String> txt5 = new ArrayList<>();
        txt5.add(getResources().getString(R.string.UseOfTheLatestSoftware));
        List<String> txt6 = new ArrayList<>();
        txt6.add(getResources().getString(R.string.TutoringAdvising));
        List<String> txt7 = new ArrayList<>();
        txt7.add(getResources().getString(R.string.FreeStudentAccessToSoftware));
        List<String> txt8 = new ArrayList<>();
        txt8.add(getResources().getString(R.string.PreparationforGraduateSchool));
        List<String> txt9 = new ArrayList<>();
        txt9.add(getResources().getString(R.string.NetworkingWithIndustry));
        List<String> txt10 = new ArrayList<>();
        txt10.add(getResources().getString(R.string.StudentNetworking));

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

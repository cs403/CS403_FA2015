package edu.svsu.cs403.cs403_fa2015;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class gxhender_AboutUs extends AppCompatActivity
{
    ExpandableListView elvAboutUs;
    AboutUsAdapter elvAboutUsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gxhender_AboutUs);
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

    private void createAboutUs()
    {
        elvAboutUs = (ExpandableListView)findViewById(R.id.elvAboutUs);
        elvAboutUsAdapter = new AboutUsAdapter();
        elvAboutUs.setAdapter(elvAboutUsAdapter);
    }

    private class AboutUsAdapter extends BaseExpandableListAdapter
    {
        private String[] tabs = getResources().getStringArray(R.array.AboutUs);
        private String[][] exercises;
        public AboutUsAdapter()
        {
            super();
            exercises = new String[tabs.length][];
            for (int i = 0; i < tabs.length; i++)
            {
                //int resId = getResources().getIdentifier("chap" + (i+1), "array", getPackageName());
                String paragraph = (Paragraph.values()[i]).name();
                int resId = getResources().getIdentifier(paragraph, "array", getPackageName());
                //resId = Username.values()[i + 1]).name();
                exercises[i] = getResources().getStringArray(resId);
            }
        }

        @Override
        public int getGroupCount()
        {
            return 0;
        }

        @Override
        public int getChildrenCount(int groupPosition)
        {
            return 0;
        }

        @Override
        public Object getGroup(int groupPosition)
        {
            return null;
        }

        @Override
        public Object getChild(int groupPosition, int childPosition)
        {
            return null;
        }

        @Override
        public long getGroupId(int groupPosition)
        {
            return 0;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition)
        {
            return 0;
        }

        @Override
        public boolean hasStableIds()
        {
            return false;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView,
                                 ViewGroup parent)
        {
            return null;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
                                 View convertView, ViewGroup parent)
        {
            return null;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition)
        {
            return false;
        }
    }

    public enum Paragraph
    {
        AboutUs(0),
        QualityInstruction(1),
        CapstoneProjects(2),
        ComputerLaboratories(3),
        UseOfTheLatestSoftware(4),
        TutoringAdvising(5),
        FreeStudentAccessToSoftware(6),
        PreparationforGraduateSchool(7),
        NetworkingWithIndustry(8),
        StudentNetworking(9);

        private int intValue;
        private Paragraph(int value) {
            intValue = value;
        }
        public int toInt(){
            return intValue;
        }
    }
}

package com.example.login.ojassloginsignup.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.example.login.ojassloginsignup.Fragments.Day_one;
import com.example.login.ojassloginsignup.Fragments.Day_three;
import com.example.login.ojassloginsignup.Fragments.Day_two;
import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.Widgets.CustomViewPager;
import com.example.login.ojassloginsignup.adapter.FragmentTabListAdapter;

public class ScheduleLayoutActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private CustomViewPager viewPager;
    private FragmentTabListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        tabLayout = (TabLayout) findViewById(R.id.schedule_tab_layout);
        viewPager = (CustomViewPager) findViewById(R.id.schedule_view_pager);



        adapter = new FragmentTabListAdapter(getSupportFragmentManager());

        adapter.addFragment(new Day_one(), "23");
        adapter.addFragment(new Day_one(), "24");
        adapter.addFragment(new Day_two(), "25");
        adapter.addFragment(new Day_three(),"26");
        adapter.addFragment(new Day_one(), "27");


        viewPager.setAdapter(adapter);
        viewPager.setPagingEnabled(false);

        tabLayout.setupWithViewPager(viewPager);

        LinearLayout tabStrip = ((LinearLayout)tabLayout.getChildAt(0));
        tabStrip.setEnabled(false);
        tabStrip.getChildAt(0).setClickable(false);
        TabLayout.Tab tab = tabLayout.getTabAt(1);
        tab.select();
        tabStrip.getChildAt(4).setClickable(false);

    }
}

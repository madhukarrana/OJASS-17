package com.example.login.ojassloginsignup.Activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.login.ojassloginsignup.Fragments.NavigationDrawerFragment;
import com.example.login.ojassloginsignup.R;


public class MainActivity extends AppCompatActivity {
    private static MainActivity mainActivity;
    private Toolbar toolbar;
    private NavigationDrawerFragment drawerFragment;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawableToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();

    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_appdrawer);
        drawerFragment.setUp((DrawerLayout) findViewById(R.id.drawerLayout), toolbar);

    }

}

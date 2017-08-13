package com.example.login.ojassloginsignup.Fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.login.ojassloginsignup.R;

import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.login.ojassloginsignup.Widgets.DrawerRow;
import com.example.login.ojassloginsignup.adapter.DrawerAdapter;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationDrawerFragment extends Fragment {

    private ActionBarDrawerToggle mDrawerToggel;
    private DrawerLayout mDrawerLayout;
    private RecyclerView recyclerView;
    private DrawerAdapter drawerAdapter;
    private ImageButton backButton;
    private CircleImageView profilePic;

    //For Login
    private TextView mUsername;
    public Context activityRef;


    public NavigationDrawerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        recyclerView = (RecyclerView) layout.findViewById(R.id.drawerList);
        mDrawerLayout = (DrawerLayout) getActivity().findViewById(R.id.drawerLayout);
        backButton = (ImageButton) layout.findViewById(R.id.navDrawerBackButton);
        //     fb_text=layout.findViewById(R.id.fb_text)

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.closeDrawers();
            }
        });

        mUsername = (TextView) layout.findViewById(R.id.userName);
        profilePic = (CircleImageView) layout.findViewById(R.id.profile_image);

        activityRef = getActivity();

        LinearLayout profileContent = (LinearLayout) layout.findViewById(R.id.profile_content);

        profileContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return layout;
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    public List<DrawerRow> getRowData() {
        List<DrawerRow> drawerData = new ArrayList<>();
        int[] icons = {R.drawable.ic_event_black_24dp,R.drawable.ic_event_black_24dp,
                R.drawable.ic_event_black_24dp,R.drawable.ic_event_black_24dp,R.drawable.ic_event_black_24dp,
                R.drawable.ic_event_black_24dp,R.drawable.ic_event_black_24dp};
        String[] titles = {"Home","Events","Map","Schedule","Sponsers","FAQ","Developers"};

        for (int i = 0; i < titles.length; i++) {
            DrawerRow drawerRow = new DrawerRow(icons[i], titles[i]);
            drawerData.add(drawerRow);
        }

        return drawerData;

    }

    public void setUp(DrawerLayout drawerLayout, Toolbar toolbar) {

        final Toolbar mToolbar = toolbar;
        mDrawerLayout = drawerLayout;

        initNavDrawer();


        mDrawerToggel = new ActionBarDrawerToggle(getActivity(), mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

         /*   @Override
         Too make that Dim Effect but this mess up the animation
            public void onDrawerSlide(View drawerView, float slideOffset) {
                if(slideOffset<0.6){
                mToolbar.setAlpha(1-slideOffset);
            }} */
        };
        mDrawerLayout.addDrawerListener(mDrawerToggel);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggel.syncState();
            }
        });

    }

    private void initNavDrawer() {
        drawerAdapter = new DrawerAdapter(mDrawerLayout, getActivity(), getRowData());
        recyclerView.setAdapter(drawerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }


    private void displayUserProfileImage() {

    }

    public void loadPic() {

    }

    @Override
    public void onResume() {
        super.onResume();
    }
}

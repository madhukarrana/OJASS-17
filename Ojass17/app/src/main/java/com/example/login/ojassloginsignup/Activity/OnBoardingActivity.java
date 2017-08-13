package com.example.login.ojassloginsignup.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.login.ojassloginsignup.GoogleSigninService;
import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.adapter.HorizontalPagerAdapter;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.google.android.gms.common.SignInButton;

public class OnBoardingActivity extends FragmentActivity {

    GoogleSigninService googleSigninService;
    SignInButton register;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_on_boarding);
        final HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager =
                (HorizontalInfiniteCycleViewPager) findViewById(R.id.hicvp);
        horizontalInfiniteCycleViewPager.setAdapter(new HorizontalPagerAdapter(OnBoardingActivity.this, false));
        register= (SignInButton) findViewById(R.id.normalButton);
        register.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        googleSigninService=new GoogleSigninService(OnBoardingActivity.this);
                        googleSigninService.login();
                        finish();
                    }
                }
        );

        Button skip= (Button) findViewById(R.id.skip);
        skip.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(OnBoardingActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
        );

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("MainActivity","Activity Result called");
        googleSigninService.handleResult(requestCode, resultCode, data);

    }

}

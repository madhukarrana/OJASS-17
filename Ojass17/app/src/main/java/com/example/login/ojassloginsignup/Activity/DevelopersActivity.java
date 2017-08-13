package com.example.login.ojassloginsignup.Activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.Widgets.DevCustomDialog;

public class DevelopersActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
    public static int dev_index;
    private Toolbar dev_toolbar;

    public static String[] dev_name = {"Aditya Kumar", "Roushan Kumar", "Vishnu Shubham", "Vivek Kr. Singh",
                                    "Mayank Agarwal", "Madhukar Rana", "Shivam Srivastava", "Risav Sagar",
                                    "Himanshu Sharma", "Manish Kumar"};
    public static int[] dev_image = {R.drawable.adi, R.drawable.roushan, R.drawable.vishnu, R.drawable.vivek,
                                    R.drawable.dev4, R.drawable.madhukar, R.drawable.dev7, R.drawable.dev8,
                                    R.drawable.himanshu, R.drawable.dev11};
    public static String[] dev_mob = {"7870517024", "9155956813", "8235335705", "7631977692",
                                    "8102502220", "9955177725", "9470918557", "9546531225", "8126769400",
                                        "8757555614"};
    public static String[] dev_email = {"adi.15j13@gmail", "roushankumar.nit@gmail", "vishnupakur@gmail",
                                        "vivek.singh0302@gmail", "abcdefgh@gmail", "madhukarrana1997@gmail",
                                        "shivamsmarty28@gmail", "abcdefgh@gmail", "kakadbest@gmail",
                                        "abcdefgh@gmail"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        dev_toolbar = (Toolbar) findViewById(R.id.dev_toolbar);
        setSupportActionBar(dev_toolbar);
        getSupportActionBar().setTitle("Developers");
        dev_toolbar.setTitleTextColor(ContextCompat.getColor(this , R.color.colorTitle));
        /// Changing the status bar color dynamically.................................................
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this , R.color.dev_statusbar_color));
        }

        i1 = (ImageView) findViewById(R.id.i1);
        i1.setImageResource(R.drawable.adi);
        i1.setOnClickListener(this);

        i2 = (ImageView) findViewById(R.id.i2);
        i2.setImageResource(R.drawable.roushan);
        i2.setOnClickListener(this);

        i3 = (ImageView) findViewById(R.id.i3);
        i3.setImageResource(R.drawable.vishnu);
        i3.setOnClickListener(this);

        i4 = (ImageView) findViewById(R.id.i4);
        i4.setImageResource(R.drawable.vivek);
        i4.setOnClickListener(this);

        i5 = (ImageView) findViewById(R.id.i5);
        i5.setImageResource(R.drawable.dev4);
        i5.setOnClickListener(this);

        i6 = (ImageView) findViewById(R.id.i6);
        i6.setImageResource(R.drawable.madhukar);
        i6.setOnClickListener(this);

        i7 = (ImageView) findViewById(R.id.i7);
        i7.setImageResource(R.drawable.dev7);
        i7.setOnClickListener(this);

        i8 = (ImageView) findViewById(R.id.i8);
        i8.setImageResource(R.drawable.dev8);
        i8.setOnClickListener(this);

        i9 = (ImageView) findViewById(R.id.i9);
        i9.setImageResource(R.drawable.himanshu);
        i9.setOnClickListener(this);

        i10 = (ImageView) findViewById(R.id.i10);
        i10.setImageResource(R.drawable.dev11);
        i10.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.i1) {
            dev_index = 0;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        } else if(id == R.id.i2) {
            dev_index = 1;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        } else if(id == R.id.i3) {
            dev_index = 2;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        } else if(id == R.id.i4) {
            dev_index = 3;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        } else if(id == R.id.i5) {
            dev_index = 4;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        } else if(id == R.id.i6) {
            dev_index = 5;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        } else if(id == R.id.i7) {
            dev_index = 6;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        } else if(id == R.id.i8) {
            dev_index = 7;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        } else if(id == R.id.i9) {
            dev_index = 8;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        } else if(id == R.id.i10) {
            dev_index = 9;
            DevCustomDialog dialog = new DevCustomDialog();
            dialog.show(getFragmentManager(), "my_dialog");
        }
    }
}

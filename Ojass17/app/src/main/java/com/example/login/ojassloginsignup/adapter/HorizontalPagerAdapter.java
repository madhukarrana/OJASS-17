package com.example.login.ojassloginsignup.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.Utils.Utils;

import static com.example.login.ojassloginsignup.Utils.Utils.setupItem;


/**
 * Created by mayank2212 on 1/11/2017.
 */

public class HorizontalPagerAdapter extends PagerAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    private boolean mIsTwoWay;

    private final Utils.LibraryObject[] LIBRARIES = new Utils.LibraryObject[]{
            new Utils.LibraryObject(
                    R.drawable.onboardin1,
                    "Strategy"
            ),
            new Utils.LibraryObject(
                    R.drawable.onboardin1,
                    "Design"
            ),
            new Utils.LibraryObject(
                    R.drawable.onboardin1,
                    "Development"
            ),
            new Utils.LibraryObject(
                    R.drawable.onboardin1,
                    "Quality Assurance"
            )
    };


    public HorizontalPagerAdapter(final Context context, final boolean isTwoWay) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mIsTwoWay = isTwoWay;
    }

    @Override
    public int getCount() {
        return 5 ;
    }

    @Override
    public int getItemPosition(final Object object) {
        return POSITION_NONE;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        final View view;
        if(position<4) {
            view = mLayoutInflater.inflate(R.layout.item, container, false);
            setupItem(view, LIBRARIES[position]);
            container.addView(view);
        }
        else
        {
            view = mLayoutInflater.inflate(R.layout.item, container, false);
        }
        return view;
    }

    @Override
    public boolean isViewFromObject(final View view, final Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(final ViewGroup container, final int position, final Object object) {
        container.removeView((View) object);
    }
}
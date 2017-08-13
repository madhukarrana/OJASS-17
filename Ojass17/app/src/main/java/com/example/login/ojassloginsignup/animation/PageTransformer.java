package com.example.login.ojassloginsignup.animation;

import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.login.ojassloginsignup.R;


/**
 * Created by rishavz_sagar on 03-Jul-16.
 */
public class PageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        View iv = page.findViewById(R.id.iv);
        if (iv != null) {
            int width = iv.getWidth();
            int height = iv.getHeight();
            if (position < -1) {
                iv.setAlpha(0);
            }
            else if (position <= 1) {

                float scaleFactor = Math.max(0, 1 - Math.abs(position));
                float vertMargin = height * (1 - scaleFactor) / 2;
                float horzMargin = width * (1 - scaleFactor) / 2;
                if (position < 0) {
                    iv.setTranslationX(horzMargin - vertMargin / 2);
                } else {
                    iv.setTranslationX(-horzMargin + vertMargin / 2);
                }

                // Scale the page down (between MIN_SCALE and 1)
                iv.setScaleX(scaleFactor);
                iv.setScaleY(scaleFactor);

                // Fade the page relative to its size.
                iv.setAlpha(0 +
                        (scaleFactor - 0) /
                                (1 - 0) * (1 - 0));
            }
        }
    }
}

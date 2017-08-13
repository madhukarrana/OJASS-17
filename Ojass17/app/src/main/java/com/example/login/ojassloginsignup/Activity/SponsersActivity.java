package com.example.login.ojassloginsignup.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.adapter.SponsersAdapter;
import com.example.login.ojassloginsignup.model.SponserDemo;

import java.util.ArrayList;

public class SponsersActivity extends Activity {
    GridView gv1,gv2,gv3;
    TextView tv1,tv2,tv3;
    int img1[] = {R.drawable.agis, R.drawable.aptron,
            R.drawable.aut, R.drawable.bankofbaroda,
            R.drawable.bluediamond, R.drawable.bluesapphire,
            R.drawable.brubeck, R.drawable.buy, R.drawable.caferegal, R.drawable.cepta,
            R.drawable.cllogo, R.drawable.cocacola, R.drawable.dominos,
            R.drawable.foodjunction, R.drawable.ford, R.drawable.funzone, R.drawable.ganpatirestro, R.drawable.hangout,
            R.drawable.honda, R.drawable.ibm, R.drawable.icici, R.drawable.indian, R.drawable.kfc,
            R.drawable.kwality, R.drawable.la, R.drawable.laptronics_logo, R.drawable.motomahal, R.drawable.nationalinsurance,
            R.drawable.ola, R.drawable.pindballuchi,
            R.drawable.pipaltree, R.drawable.prabhatkhabar, R.drawable.radiodhoom,
            R.drawable.safari, R.drawable.sonet,
            R.drawable.southpark, R.drawable.spectrumloreral,R.drawable.time,
            R.drawable.subway, R.drawable.time,
            R.drawable.turtle, R.drawable.whiterosehotel, R.drawable.vidyamandir};

    int img2[]={R.drawable.honda2,R.drawable.laptronics_logo
            };

    /*int img3[]={R.drawable.agis,R.drawable.aptron,
            R.drawable.aut,R.drawable.bankofbaroda,
            R.drawable.bluesapphire,R.drawable.brubeck,
    };*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsers);
        gv1=(GridView) findViewById(R.id.gridView2);
        gv2=(GridView) findViewById(R.id.gridView1);
        //gv3=(GridView) findViewById(R.id.gridView3);
        tv1=(TextView) findViewById(R.id.sponsertv1);
        tv2=(TextView) findViewById(R.id.sponsertv2);
        //tv3=(TextView) findViewById(R.id.sponsertv3);

        int dp1=convertDpToPixel(45*(img1.length),getApplicationContext());

        ViewGroup.LayoutParams layoutParams=gv1.getLayoutParams();
        layoutParams.height=dp1;

        gv1.setLayoutParams(layoutParams);
        SponsersAdapter ad=new SponsersAdapter(this, getSponsers(img1));
        gv1.setAdapter(ad);


        SponsersAdapter ad2=new SponsersAdapter(this, getSponsers(img2));
        gv2.setAdapter(ad2);
        /*Adapter ad3=new Adapter(this, getSponsers(img3));
        gv3.setAdapter(ad3);*/


       int dp2=convertDpToPixel(45*img2.length,getApplicationContext());

        ViewGroup.LayoutParams layoutParams1=gv2.getLayoutParams();
        layoutParams1.height=dp2;
        gv2.setLayoutParams(layoutParams1);

       /* int dp3=convertDpToPixel(150*img3.length-200,getApplicationContext());

        ViewGroup.LayoutParams layoutParams2=gv3.getLayoutParams();
        layoutParams2.height=dp3;
        gv3.setLayoutParams(layoutParams2);*/
    }
    private int convertDpToPixel(int i, Context context) {
        Resources resources=context.getResources();
        return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,i,resources.getDisplayMetrics());
        // TODO Auto-generated method stub

    }
    private ArrayList<SponserDemo> getSponsers(int im[])
    {
        ArrayList<SponserDemo> sponser=new ArrayList<SponserDemo>();
        int i;
        for(i=0;i<im.length;i++)
            sponser.add(new SponserDemo(im[i]));
        return sponser;

    }
}

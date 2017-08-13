package com.example.login.ojassloginsignup.Widgets;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.login.ojassloginsignup.Activity.DevelopersActivity;
import com.example.login.ojassloginsignup.R;

public class DevCustomDialog extends DialogFragment implements View.OnClickListener {

    LayoutInflater inflater;
    View v;
    private TextView tv_name, tv_mob, tv_email;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.dev_custom_dialog, null);
        ImageView iv = (ImageView) v.findViewById(R.id.dev_image);
        tv_name = (TextView) v.findViewById(R.id.dev_name);
        ImageView iv2 = (ImageView) v.findViewById(R.id.dev_bg_image);
        tv_mob = (TextView) v.findViewById(R.id.dev_mob);
        tv_mob.setPaintFlags(tv_mob.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tv_email = (TextView) v.findViewById(R.id.dev_email);

        tv_name.setText(DevelopersActivity.dev_name[DevelopersActivity.dev_index]);
        tv_mob.setText(DevelopersActivity.dev_mob[DevelopersActivity.dev_index]);
        tv_email.setText(DevelopersActivity.dev_email[DevelopersActivity.dev_index]);
        iv.setImageResource(DevelopersActivity.dev_image[DevelopersActivity.dev_index]);
        iv2.setImageResource(DevelopersActivity.dev_image[DevelopersActivity.dev_index]);

        tv_mob.setOnClickListener(this);

         //   AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        //    dialog.setView(v);
        //    return dialog.create();

        Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(v);
        dialog.getWindow().setLayout((int)getScreenWidth(getActivity()),
                WindowManager.LayoutParams.WRAP_CONTENT);
        return dialog;
    }

    public static int getScreenWidth(Activity activity)  {
        Point size = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(size);
        return size.x;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.dev_mob) {
            String number = tv_mob.getText().toString();
            if(number.length() > 2)
                callPhoneIntent(number);
        }
    }

    public void callPhoneIntent(String number) {
        number = number.trim();
        try {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("CALL_INTENT", "CALL FAILED", e);
        }
    }
}

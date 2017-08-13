package com.example.login.ojassloginsignup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;

import com.example.login.ojassloginsignup.Activity.UserInfoActivity;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by mayank2212 on 1/9/2017.
 */

public class GoogleSigninService {

    private final int RCSIGNIN = 9001;

    private static GoogleApiClient mGoogleApiClient;
    private Context context;
    private Activity activity;
    private String KEY = "AIzaSyBzLEc-Wqxfv6CRxSlKO1zeKYG50TF6BNU";
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;


    public GoogleSigninService(Context context) {
        activity = (Activity) context;
        this.context = context;
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestProfile()
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(context)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();
        mGoogleApiClient.connect();
    }

    public void login() {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        ((Activity) context).startActivityForResult(signInIntent, RCSIGNIN);
    }

    //for requesting permission in marshmallow
    public void requestPermission(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case 1:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
                    ((Activity) context).startActivityForResult(signInIntent, RCSIGNIN);
                } else {
                    Toast.makeText(context, "Login Permission Denied by the user", Toast.LENGTH_SHORT).show();
                }
        }
    }

    public void onStart() {
        mGoogleApiClient.connect();
    }

    public void handleResult(int requestCode, int resultCode, Intent data) {

            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            //Log.e("GoogleSignInservice",result.getStatus().toString());
            if (result.isSuccess()) {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = result.getSignInAccount();
                Toast.makeText(context, "Login Successful",
                        Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,UserInfoActivity.class);
                context.startActivity(intent);
                ((Activity)context).finish();
              //  Log.d("GoogleSigninService","Login Successful");
            } else {
//                Toast.makeText(context, "Google Sign in Authentication failed.",
//                        Toast.LENGTH_SHORT).show();
                Toast.makeText(context, result.getStatus().toString(),
                        Toast.LENGTH_SHORT).show();
                //Log.d("MainActivity","Google Sign in Authentication failed.");
            }
    }


}

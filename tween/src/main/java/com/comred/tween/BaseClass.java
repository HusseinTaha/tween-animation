package com.comred.tween;

import android.app.Activity;
import android.os.Bundle;


/**
 * Created by HTaha on 3/23/2015.
 */
public class BaseClass extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new SharedPrefs(this.getApplicationContext());
        new Utility("Your Project Name", this.getApplicationContext(), this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        enterActivity();
    }

    @Override
    protected void onPause() {
        super.onPause();
        leftActivity();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        leftActivity();
    }

    public void leftActivity() {
    }

    public void enterActivity() {
    }
}

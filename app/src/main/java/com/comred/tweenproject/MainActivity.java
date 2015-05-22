package com.comred.tweenproject;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.comred.tween.BaseClass;
import com.comred.tween.TweenAnimation;


public class MainActivity extends BaseClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void enterActivity() {
        super.enterActivity();

        TweenAnimation.fromLeft(findViewById(R.id.test1), 1000, 300);
        TweenAnimation.fromRight(findViewById(R.id.test2), 1000, 300);
        TweenAnimation.fromTop(findViewById(R.id.test3), 1000, 300);
        TweenAnimation.fromBottom(findViewById(R.id.test4), 1000, 300);
        TweenAnimation.fromLeft(findViewById(R.id.test5), 1000, 300);
        TweenAnimation.fromRight(findViewById(R.id.test6), 1000, 300);

    }

    @Override
    public void leftActivity() {
        super.leftActivity();

        TweenAnimation.toLeft(findViewById(R.id.test1), 1000, 300);
        TweenAnimation.toRight(findViewById(R.id.test2), 1000, 300);
        TweenAnimation.toTop(findViewById(R.id.test3), 1000, 300);
        TweenAnimation.toBottom(findViewById(R.id.test4), 1000, 300);
        TweenAnimation.toLeft(findViewById(R.id.test5), 1000, 300);
        TweenAnimation.toRight(findViewById(R.id.test6), 1000, 300);

    }
}

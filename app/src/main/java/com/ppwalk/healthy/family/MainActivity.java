package com.ppwalk.healthy.family;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.orhanobut.logger.Logger;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "健康的身体是革命的本钱，好身体才是最重要！", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                if (BuildConfig.DEBUG) {
                    testLog();
                }
            }
        });
    }

    private void testLog() {
        if (BuildConfig.DEBUG) {

            Logger.v("hello 中国");
            Logger.d("hello 中国");
            Logger.i("hello 中国");
            Logger.w("hello 中国");
            Logger.e("hello 中国");
            testSpecialLog();
            Logger.d(new String[]{"sdfsd", "红果果"});
        }
    }

    private static void testSpecialLog() {
        Logger.wtf("hello wtf");
        Logger.json("[{\"a\":\"b\",\"b\":\"b\",\"c\":\"b\"},{\"a\":\"b\",\"b\":{\"a\":{\"a\":\"b\",\"b\":\"b\",\"d\":\"b\"},\"x\":\"b\",\"w\":{\"a\":\"b\",\"v\":\"b\",\"ee\":\"b\"}},\"cc\":\"b\"},{\"aa\":\"b\",\"ar\":\"b\",\"ah\":\"b\"}]");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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
}

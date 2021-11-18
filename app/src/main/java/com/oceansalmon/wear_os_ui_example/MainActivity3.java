package com.oceansalmon.wear_os_ui_example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ProgressBar indicator = (ProgressBar) findViewById(R.id.progressBar);
        ProgressBarAnimation anim = new ProgressBarAnimation(indicator, 0, 100);
        indicator.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        }, 4000);
    }
}
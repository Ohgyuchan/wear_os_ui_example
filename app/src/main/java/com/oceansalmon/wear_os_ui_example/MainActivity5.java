package com.oceansalmon.wear_os_ui_example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView tvTitle = findViewById(R.id.detailTitle);
        TextView tvDuration = findViewById(R.id.duration);
        TextView tvDesc = findViewById(R.id.detailDesc);

        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String category = intent.getStringExtra("category");
        String startTime = intent.getStringExtra("startTime");
        String endTime = intent.getStringExtra("endTime");
        String duration = startTime + " ~ " + endTime;
        String desc = intent.getStringExtra("desc");

        tvTitle.setText(title);
        tvDuration.setText(duration);
        tvDesc.setText(desc);

        tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),tvTitle.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
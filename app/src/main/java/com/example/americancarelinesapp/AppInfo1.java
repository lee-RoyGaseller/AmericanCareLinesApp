package com.example.americancarelinesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class AppInfo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info1);
        RelativeLayout rlayout = (RelativeLayout) findViewById(R.id.openingOne);
        rlayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveOn();

            }

        });
    }
    public void moveOn() {
        Intent intent = new Intent(this, AppInfo2.class);
        startActivity(intent);
    }
}

package com.example.americancarelinesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class AppInfo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info2);
        RelativeLayout rlayout = (RelativeLayout) findViewById(R.id.openingTwo);
        rlayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveOn();

            }

        });
    }
    public void moveOn() {
        Intent intent = new Intent(this, AppInfo3.class);
        startActivity(intent);
    }
}

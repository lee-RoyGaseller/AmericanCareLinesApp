package com.example.americancarelinesapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ChooseServicesActivity extends AppCompatActivity {

    public CheckBox wheelchair;
    public CheckBox luggage;
    public CheckBox carryOn;
    public CheckBox full;
//    public CheckBox toPre;
//    public CheckBox fromPre;
//    public CheckBox toGate;
//    public CheckBox fromGate;
//    public CheckBox checkIn;

    int total;
    public TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_services);

        wheelchair = findViewById(R.id.cb_wheelchair);
        luggage = findViewById(R.id.cb_luggage);
        carryOn = findViewById(R.id.cb_carryon);
        full = findViewById(R.id.cb_buddy);
//        toPre = findViewById(R.id.cb_toPre);
//        fromPre = findViewById(R.id.cb_fromPre);
//        toGate = findViewById(R.id.cb_toGate);
//        fromGate = findViewById(R.id.cb_fromGate);
//        checkIn = findViewById(R.id.cb_checkIn);
        total = 0;
        tv = findViewById(R.id.tv_intTotal);
        tv.setText("Total: " + String.valueOf(total));
    }
    public void moveOn(View v) {
        Intent intent = new Intent(this, SelectHelper.class);
        startActivity(intent);
    }


    public void checkWheel(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        if (checked) {
            total += 0;
        }
        else {
            total -= 0;
        }

        tv.setText("Total: " + String.valueOf(total));
    }

    public void checkLuggage(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        if (checked) {
            total += 10;
        }
        else {
            total -= 10;
        }

        tv.setText("Total: " + String.valueOf(total));
    }

    public void checkCarry(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        if (checked) {
            total += 7;
        }
        else {
            total -= 7;
        }

        tv.setText("Total: " + String.valueOf(total));
    }

    public void checkBuddy(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        if (checked) {
            total += 20;
        }
        else {
            total -= 20;
        }

        tv.setText("Total: " + String.valueOf(total));
    }

//    public void checkToPre(View v) {
//        boolean checked = ((CheckBox) v).isChecked();
//        if (checked) {
//            total += 0;
//        }
//        else {
//            total -= 0;
//        }
//
//        tv.setText(String.valueOf(total));
//    }
//
//    public void checkFromPre(View v) {
//        boolean checked = ((CheckBox) v).isChecked();
//        if (checked) {
//            total += 0;
//        }
//        else {
//            total -= 0;
//        }
//
//        tv.setText(String.valueOf(total));
//    }
//
//    public void checkToGate(View v) {
//        boolean checked = ((CheckBox) v).isChecked();
//        if (checked) {
//            total += 0;
//        }
//        else {
//            total -= 0;
//        }
//
//        tv.setText(String.valueOf(total));
//    }
//
//    public void checkFromGate(View v) {
//        boolean checked = ((CheckBox) v).isChecked();
//        if (checked) {
//            total += 0;
//        }
//        else {
//            total -= 0;
//        }
//
//        tv.setText(String.valueOf(total));
//    }
//
//    public void checkCheck(View v) {
//        boolean checked = ((CheckBox) v).isChecked();
//        if (checked) {
//            total += 0;
//        }
//        else {
//            total -= 0;
//        }
//
//        tv.setText(String.valueOf(total));
//    }
}

package com.example.bimo003.app_1st;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ActivityB extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lingyq", "ActivityB onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
    @Override
    protected void onStart() {
        Log.d("lingyq", "ActivityB onStart: ");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lingyq", "ActivityB onResume: ");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d("lingyq", "ActivityB onRestart: ");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.d("lingyq", "ActivityB onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("lingyq", "ActivityB onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lingyq", "ActivityB onDestroy: ");
        super.onDestroy();
    }

    public void startMainActivity(View v) {
        Intent intent = new Intent(ActivityB.this, MainActivity.class);
        startActivity(intent);
    }

    public void startActivityA(View v) {
        Intent intent = new Intent(ActivityB.this, ActivityA.class);
        startActivity(intent);
    }

    public void finishActivityB(View v) {
        Log.d("lingyq", "ActivityB finishActivityB: ");
        ActivityB.this.finish();
    }

    public void startActivityDialog(View v) {
        Intent intent = new Intent(ActivityB.this, ActivityDialog.class);
        startActivity(intent);
    }
}

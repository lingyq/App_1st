package com.example.bimo003.app_1st;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lingyq", "ActivityA onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }
    @Override
    protected void onStart() {
        Log.d("lingyq", "ActivityA onStart: ");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lingyq", "ActivityA onResume: ");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d("lingyq", "ActivityA onRestart: ");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.d("lingyq", "ActivityA onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("lingyq", "ActivityA onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lingyq", "ActivityA onDestroy: ");
        super.onDestroy();
    }

    public void startMainActivity(View v) {
        Intent intent = new Intent(ActivityA.this, MainActivity.class);
        startActivity(intent);
    }

    public void finishActivityA(View v) {
        Log.d("lingyq", "ActivityA finishActivityA: ");
        ActivityA.this.finish();
    }

    public void startActivityB(View v) {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        startActivity(intent);
    }

    public void startActivityDialog(View v) {
        Intent intent = new Intent(ActivityA.this, ActivityDialog.class);
        startActivity(intent);
    }
}

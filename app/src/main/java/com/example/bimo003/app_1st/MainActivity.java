package com.example.bimo003.app_1st;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.bimo003.app_1st.util.StatusTracker;
import com.example.bimo003.app_1st.util.Utils;
public class MainActivity extends AppCompatActivity {
    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    private StatusTracker mStatusTracker = StatusTracker.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lingyq", "MainActivity onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivityName = getString(R.string.MainActivity);
        mStatusView = (TextView)findViewById(R.id.status_view_a);
        mStatusAllView = (TextView)findViewById(R.id.status_view_all_a);
        mStatusTracker.setStatus(mActivityName,          getString(R.string.on_create));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    @Override
    protected void onStart() {
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_start));
        Utils.printStatus(mStatusView, mStatusAllView);
        Log.d("lingyq", "MainActivity onStart: ");
        super.onStart();
    }

    @Override
    protected void onResume() {
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_resume));
        Utils.printStatus(mStatusView, mStatusAllView);
        Log.d("lingyq", "MainActivity onResume: ");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_restart));
        Utils.printStatus(mStatusView, mStatusAllView);
        Log.d("lingyq", "MainActivity onRestart: ");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_pause));
        Utils.printStatus(mStatusView, mStatusAllView);
        Log.d("lingyq", "MainActivity onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_stop));
        Utils.printStatus(mStatusView, mStatusAllView);
        Log.d("lingyq", "MainActivity onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_destroy));
        Utils.printStatus(mStatusView, mStatusAllView);
        mStatusTracker.clear();
        Log.d("lingyq", "MainActivity onDestroy: ");
        super.onDestroy();
    }

    public void finishMainActivity(View v) {
        Log.d("lingyq", "MainActivity finishMainActivity: ");
        MainActivity.this.finish();
    }

    public void startActivityA(View v) {
        Intent intent = new Intent(MainActivity.this, ActivityA.class);
        startActivity(intent);
    }

    public void startActivityB(View v) {
        Intent intent = new Intent(MainActivity.this, ActivityB.class);
        startActivity(intent);
    }

    public void startActivityDialog(View v) {
        Intent intent = new Intent(MainActivity.this, ActivityDialog.class);
        startActivity(intent);
    }
}

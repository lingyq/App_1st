package com.example.bimo003.app_1st;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class ActivityDialog extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lingyq", "ActivityDialog onCreate: ");
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);
    }

    public void finishActivityDialog(View v) {
        Log.d("lingyq", "ActivityDialog finishDialog: ");
        ActivityDialog.this.finish();
    }
}

package com.doops.fcmnotify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TestActivity extends AppCompatActivity {

    private static final String TAG = "TestActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        if (getIntent().getExtras() != null) {
            Log.e(TAG, "onStart: "+getIntent().getExtras().get("message"));
            Log.e(TAG, "onStart: "+getIntent().getExtras().get("title"));
            Log.e(TAG, "onStart: "+getIntent().getExtras().get("action"));

        }
    }
}

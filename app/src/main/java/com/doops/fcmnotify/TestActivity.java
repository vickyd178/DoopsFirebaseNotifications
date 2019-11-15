package com.doops.fcmnotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import static com.doops.fcmnotify.MyFirebaseMessagingService.DATA;

public class TestActivity extends AppCompatActivity {

    private static final String TAG = "TestActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        if (getIntent().getExtras() != null) {
            NotificationData data = (NotificationData) getIntent().getSerializableExtra(DATA);

            assert data != null;
            Log.e(TAG, "onStart: "+data.getTitle());
            Log.e(TAG, "onStart: "+data.getMessage());
            Log.e(TAG, "onStart: "+getIntent().getAction());
        }
    }

    @Override
    public void onBackPressed() {
        if (getIntent().getExtras()!=null){
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }
}

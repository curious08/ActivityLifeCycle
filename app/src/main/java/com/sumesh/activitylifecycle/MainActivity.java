package com.sumesh.activitylifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MAIN3", "onStart" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MAIN3", "onResume" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MAIN3", "onPause" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MAIN3", "onStop" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MAIN3", "onDestroy" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MAIN3", "onRestart" );
    }
}
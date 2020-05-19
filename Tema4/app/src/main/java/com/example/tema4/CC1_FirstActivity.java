package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class CC1_FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_c1__first);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(this.getClass().getName(), "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(this.getClass().getName(), "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(this.getClass().getName(), "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(this.getClass().getName(), "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(this.getClass().getName(), "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(this.getClass().getName(), "onDestroy");
    }

    public void openSecondActivityOnClick(View view) {

        Intent intent = new Intent(CC1_FirstActivity.this, CC1_SecondActivity.class);
        startActivity(intent);

    }
}

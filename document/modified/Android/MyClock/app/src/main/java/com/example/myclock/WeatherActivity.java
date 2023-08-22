package com.example.myclock;

import static android.content.Intent.CATEGORY_APP_WEATHER;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }
    protected void onStart() {
        super.onStart();
        Log.d("WeatherActivity:", "onStart");
    }
    protected void onResume() {
        super.onResume();
        Log.d("WeatherActivity:", "onResume");
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(CATEGORY_APP_WEATHER);
        startActivity(intent);
    }
}
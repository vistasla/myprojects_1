package com.example.myclock;

import android.app.ActivityManager;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InteractingWithOtherAppsActivity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interacting_with_other_apps3);
    }
    public void sendMessage(View view) throws IOException, InterruptedException {
        ArrayList arrayList=new ArrayList();

        arrayList.add(Calendar.MONDAY);
        arrayList.add(Calendar.TUESDAY);
        arrayList.add(Calendar.WEDNESDAY);
        arrayList.add(Calendar.THURSDAY);
        arrayList.add(Calendar.FRIDAY);
        arrayList.add(Calendar.SATURDAY);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "title")
                .putExtra(AlarmClock.EXTRA_HOUR, 0)
                .putExtra(AlarmClock.EXTRA_MINUTES, 0)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                ;

        startActivity(intent);
        Thread.currentThread().sleep(3000);
        ActivityManager activityManager=getSystemService(ActivityManager.class);
        List<ActivityManager.AppTask> appTaskList=activityManager.getAppTasks();
        appTaskList.get(0).moveToFront();
        Button button= (Button) findViewById(R.id.button7);
        button.performClick();
    }
    public void sendMessage_1(View view) throws IOException, InterruptedException {
        ArrayList arrayList=new ArrayList();

        arrayList.add(Calendar.MONDAY);
        arrayList.add(Calendar.TUESDAY);
        arrayList.add(Calendar.WEDNESDAY);
        arrayList.add(Calendar.THURSDAY);
        arrayList.add(Calendar.FRIDAY);
        arrayList.add(Calendar.SATURDAY);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "title")
                .putExtra(AlarmClock.EXTRA_HOUR, 1)
                .putExtra(AlarmClock.EXTRA_MINUTES, 0)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                ;

        startActivity(intent);
        Thread.currentThread().sleep(3000);
        ActivityManager activityManager=getSystemService(ActivityManager.class);
        List<ActivityManager.AppTask> appTaskList=activityManager.getAppTasks();
        appTaskList.get(0).moveToFront();
        Button button= (Button) findViewById(R.id.button8);
        button.performClick();
    }
    public void sendMessage_2(View view) throws IOException {
        ArrayList arrayList=new ArrayList();

        arrayList.add(Calendar.MONDAY);
        arrayList.add(Calendar.TUESDAY);
        arrayList.add(Calendar.WEDNESDAY);
        arrayList.add(Calendar.THURSDAY);
        arrayList.add(Calendar.FRIDAY);
        arrayList.add(Calendar.SATURDAY);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "title")
                .putExtra(AlarmClock.EXTRA_HOUR, 2)
                .putExtra(AlarmClock.EXTRA_MINUTES, 0)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                ;

        startActivity(intent);
    }
}
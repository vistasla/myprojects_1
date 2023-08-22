package com.example.myapplication;

import android.app.ActivityManager;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateAlarmActivity extends AppCompatActivity {
    String[] alarmTitleArray={"第","节","课","下","放学","了","早","中","晚","餐","一","二","三","四","五","六","七","八","九","十","十一","十二",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_alarm);
    }
    protected void onStart() {
        super.onStart();
        Log.d("CreateAlarmActivity", "onStart");
    }
    protected void onResume() {
        super.onResume();
        Log.d("CreateAlarmActivity", "onResume");
    }
    protected void onPause() {
        super.onPause();
        Log.d("CreateAlarmActivity", "onPause");
    }
    protected void onStop() {
        super.onStop();
        Log.d("CreateAlarmActivity", "onStop");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d("CreateAlarmActivity", "onRestart");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CreateAlarmActivity", "onDestroy");
    }
    public void createAlarm(String title, int hours, int minutes) throws InterruptedException {

        ArrayList arrayList=new ArrayList();

        arrayList.add(Calendar.MONDAY);
        arrayList.add(Calendar.TUESDAY);
        arrayList.add(Calendar.WEDNESDAY);
        arrayList.add(Calendar.THURSDAY);
        arrayList.add(Calendar.FRIDAY);
        arrayList.add(Calendar.SATURDAY);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, title)
                .putExtra(AlarmClock.EXTRA_HOUR, hours)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"老式闹钟")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,true)
                ;

        startActivity(intent);

        Thread.currentThread().sleep(1500);
        ActivityManager activityManager=getSystemService(ActivityManager.class);
        List<ActivityManager.AppTask> appTaskList=activityManager.getAppTasks();
        appTaskList.get(0).moveToFront();
        Thread.currentThread().sleep(1000);
    }

    public void getSunsetTime(){
    }
    public void computeTime(int SunsetTime_HOURS, int SunsetTime_MINUTES) throws InterruptedException {
        int SunsetTime_HOURS_1=SunsetTime_HOURS;
        int SunsetTime_MINUTES_1=SunsetTime_MINUTES;
        for (int i = 23; i >= -1; i--) {
            if(i==23){
                Log.d("i:", String.valueOf(i));
                if(SunsetTime_MINUTES_1>=45){
                    SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-45;
                    createAlarm(alarmTitleArray[4]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                    Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                    Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                }
                else{
                    SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                    SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+15;
                    createAlarm(alarmTitleArray[4]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                    Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                    Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                }
            }
            else{
                if(i==11){
                    Log.d("i11:", String.valueOf(i));
                    if(SunsetTime_MINUTES_1>=30){
                        SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                        SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-30;
                        createAlarm(alarmTitleArray[0]+alarmTitleArray[15]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                        Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                        Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));

                    }
                    else{
                        SunsetTime_HOURS_1=SunsetTime_HOURS_1-2;
                        SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+30;
                        createAlarm(alarmTitleArray[0]+alarmTitleArray[15]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                        Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                        Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                    }
                }
                else{
                    if(i==-1){
                        Log.d("i:", String.valueOf(i));
                        SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                        createAlarm(alarmTitleArray[6]+alarmTitleArray[9], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                        Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                        Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                        Toast.makeText(this,"CreateAlarm Completed.", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        if(i%2==0){
                            Log.d("i:", String.valueOf(i));
                            if(SunsetTime_MINUTES_1>=40){
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-40;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[i/2+10]+alarmTitleArray[1]+alarmTitleArray[2], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                            else{
                                SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+20;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[i/2+10]+alarmTitleArray[1]+alarmTitleArray[2], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                        }
                        else{
                            Log.d("i:", String.valueOf(i));
                            if(SunsetTime_MINUTES_1>=10){
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-10;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[(i+1)/2+9]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                            else{
                                SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+50;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[(i+1)/2+9]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                        }

                    }
                }

            }

        }

    }
    public void sendMessage(View view) throws IOException, InterruptedException {
        computeTime(18,52);
    }
}
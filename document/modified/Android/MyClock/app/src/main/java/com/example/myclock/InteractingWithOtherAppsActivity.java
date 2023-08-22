package com.example.myclock;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class InteractingWithOtherAppsActivity extends AppCompatActivity {
    int hours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interacting_with_otherapps);
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
                .putExtra(AlarmClock.EXTRA_HOUR, hours)
                .putExtra(AlarmClock.EXTRA_MINUTES, 0)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                ;

        //intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        Log.d("before0:", String.valueOf(new Date().getSeconds()));
        startActivity(intent);
        Log.d("before:", String.valueOf(new Date().getSeconds()));
        Thread.currentThread().sleep(30000);
        ActivityManager activityManager=getSystemService(ActivityManager.class);
        List<ActivityManager.AppTask> appTaskList=activityManager.getAppTasks();
        Log.d("after:",String.valueOf(new Date().getSeconds()) );
        appTaskList.get(0).moveToFront();
        for (int i = 0; i <appTaskList.size() ; i++) {
            Log.d(String.valueOf(i)+":"+String.valueOf(new Date().getSeconds()), String.valueOf(appTaskList.get(i).getTaskInfo()));

            //当窗口返回结果再循环.
        }
        /*Thread.currentThread().sleep(3000);
        ActivityManager activityManager=getSystemService(ActivityManager.class);
        List<ActivityManager.RecentTaskInfo> recentTaskInfoList= activityManager.getRecentTasks(3, RECENT_WITH_EXCLUDED);
        for (int i = 0; i <recentTaskInfoList.size() ; i++) {
            Log.d("i:", String.valueOf(recentTaskInfoList.get(i).taskId));

            //当窗口返回结果再循环.
        }*/

        /*
        List<ActivityManager.RunningAppProcessInfo> runningAppProcessInfoList= activityManager.getRunningAppProcesses();
        List<ActivityManager.RunningTaskInfo> runningTaskInfoList=activityManager.getRunningTasks(3);
        activityManager.getRecentTasks();*/



        /*for (int i = 0; i <12 ; i++) {
             Log.d("i:", String.valueOf(i));
             intent.putExtra("inta",i);
             startActivity(intent);
             //当窗口返回结果再循环.
        }*/

    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("requested activity returned:",String.valueOf(resultCode));
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == RESULT_OK) {
            Log.d("requested activity returned:",String.valueOf(resultCode));
        }
    }*/

    /*@Override
    public void startActivityFromChild(@NonNull Activity child, Intent intent, int requestCode) {
        super.startActivityFromChild(child, intent, requestCode);
    }*/
}
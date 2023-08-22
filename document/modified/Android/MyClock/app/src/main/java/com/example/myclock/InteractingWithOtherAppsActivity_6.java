package com.example.myclock;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;

public class InteractingWithOtherAppsActivity_6 extends AppCompatActivity {
    int hours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interacting_with_otherapps);
    }
    public void sendMessage(View view) throws IOException, InterruptedException {
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.addCategory("android.intent.category.APP_MUSIC");
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        ActivityManager activityManager=getSystemService(ActivityManager.class);
        List<ActivityManager.AppTask> appTaskList=activityManager.getAppTasks();
        for (int i = 0; i <appTaskList.size() ; i++) {
            Log.d("i:", String.valueOf(appTaskList.get(i).getTaskInfo()));

            //当窗口返回结果再循环.
        }
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
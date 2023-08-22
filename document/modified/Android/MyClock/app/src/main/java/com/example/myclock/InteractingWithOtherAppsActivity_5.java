package com.example.myclock;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.test.runner.lifecycle.ActivityLifecycleCallback;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitor;
import androidx.test.runner.lifecycle.Stage;

import java.io.IOException;
import java.util.Collection;

public class InteractingWithOtherAppsActivity_5 extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interacting_with_other_apps5);
    }
    public void sendMessage(View view) throws IOException {
        Intent intent = new Intent(this,WeatherActivity.class);
        /*View view1=getCurrentFocus();
        Log.d("InteractingWithOtherAppsActivity_5:",String.valueOf(view1.getId()) );*/
        startActivity(intent);
        /*View view2=getCurrentFocus();
        Log.d("InteractingWithOtherAppsActivity_5:",String.valueOf(view2.getId()) );*/
        Instrumentation instrumentation=new Instrumentation();
        ActivityLifecycleMonitor activityLifecycleMonitor=new ActivityLifecycleMonitor() {
            @Override
            public void addLifecycleCallback(ActivityLifecycleCallback callback) {

            }

            @Override
            public void removeLifecycleCallback(ActivityLifecycleCallback callback) {

            }

            @Override
            public Stage getLifecycleStageOf(Activity activity) {
                return null;
            }

            @Override
            public Collection<Activity> getActivitiesInStage(Stage stage) {
                return null;
            }
        };
        //instrumentation.addMonitor();
        /*instrumentation.callActivityOnNewIntent();
        Activity activity=new Activity();
        activity.finishActivity();
        activity.finishAffinity();
        activity.finishActivityFromChild();*/
        finishAndRemoveTask();
        /*PressBackAction pressBackAction=new PressBackAction(false);
        View view2=getCurrentFocus();
        pressBackAction.perform(new MyUiController(),view2);*/
    }


}
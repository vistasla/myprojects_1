package com.example.myclock;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;

import androidx.test.espresso.InjectEventSecurityException;
import androidx.test.espresso.UiController;
import androidx.test.runner.lifecycle.ActivityLifecycleCallback;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitor;
import androidx.test.runner.lifecycle.Stage;

import java.util.Collection;

public class MyUiController implements UiController, ActivityLifecycleMonitor {


    @Override
    public boolean injectMotionEvent(MotionEvent event) throws InjectEventSecurityException {
        return false;
    }

    @Override
    public boolean injectMotionEventSequence(Iterable<MotionEvent> events) throws InjectEventSecurityException {
        return false;
    }

    @Override
    public boolean injectKeyEvent(KeyEvent event) throws InjectEventSecurityException {
        return false;
    }

    @Override
    public boolean injectString(String str) throws InjectEventSecurityException {
        return false;
    }

    @Override
    public void loopMainThreadUntilIdle() {

    }

    @Override
    public void loopMainThreadForAtLeast(long millisDelay) {

    }

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
}

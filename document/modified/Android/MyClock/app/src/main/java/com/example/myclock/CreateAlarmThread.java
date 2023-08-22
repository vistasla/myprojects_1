package com.example.myclock;

import android.content.Context;

class CreateAlarmThread extends Thread {
    public void run(Context context, int i) {
        CreateAlarm_2 createAlarm_2=new CreateAlarm_2(context,i);
    }
}


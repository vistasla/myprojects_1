package com.example.myclock;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.widget.Toast;

public class CreateAlarm_2 {
    public CreateAlarm_2(Context context,int i){
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        /*Class[] classArray=new Class[12];
        classArray[i]=getClass();
        Class[] classArray= {MediaPlayerService.class};
        classArray[i]=MediaPlayerService.class;*/
        Intent intent = new Intent(context, MediaPlayerService.class);
        PendingIntent alarmIntent = PendingIntent.getService(context, i, intent, PendingIntent.FLAG_IMMUTABLE);
        /*Intent[] intentArray=new Intent[12];
        intentArray[i]= new Intent(context, MediaPlayerActivity.class);*/
        /*PendingIntent[] pendingIntentArray=new PendingIntent[12];
        pendingIntentArray[i]=PendingIntent.getActivity(context, i, intentArray[i], PendingIntent.FLAG_IMMUTABLE);*/
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.MINUTE, calendar.getTime().getMinutes()+i+1);
        calendar.set(calendar.SECOND, 0);
        calendar.set(calendar.MILLISECOND, 0);
        Toast.makeText(context,"MINUTES:"+String.valueOf(calendar.getTime().getMinutes()) , Toast.LENGTH_SHORT).show();
        Toast.makeText(context,"SECONDS:"+String.valueOf(calendar.getTime().getSeconds()) , Toast.LENGTH_SHORT).show();
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                1000 * 60 * 0, alarmIntent);

    }
}






























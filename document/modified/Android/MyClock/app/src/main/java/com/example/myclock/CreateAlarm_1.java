package com.example.myclock;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.widget.Toast;

public class CreateAlarm_1 {
    public CreateAlarm_1(Context context){
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        AlarmManager.AlarmClockInfo alarmClockInfo=new AlarmManager.AlarmClockInfo(0,null);
        Intent intent = new Intent(context, MediaPlayerService.class);
        Intent intent_1 = new Intent(context, MediaPlayerService_1.class);
        PendingIntent alarmIntent = PendingIntent.getService(context, 0, intent, PendingIntent.FLAG_IMMUTABLE);
        PendingIntent alarmIntent_1 = PendingIntent.getService(context, 0, intent_1, PendingIntent.FLAG_IMMUTABLE);
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.MINUTE, calendar.getTime().getMinutes()+1);
        calendar.set(calendar.SECOND, 0);
        calendar.set(calendar.MILLISECOND, 0);
        Toast.makeText(context,"MINUTES:"+String.valueOf(calendar.getTime().getMinutes()) , Toast.LENGTH_SHORT).show();
        Toast.makeText(context,"SECONDS:"+String.valueOf(calendar.getTime().getSeconds()) , Toast.LENGTH_SHORT).show();
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                1000 * 60 * 0, alarmIntent);


        calendar.set(calendar.MINUTE, calendar.getTime().getMinutes()+1);

        Toast.makeText(context,"MINUTES_1:"+String.valueOf(calendar.getTime().getMinutes()) , Toast.LENGTH_SHORT).show();
        Toast.makeText(context,"SECONDS_1:"+String.valueOf(calendar.getTime().getSeconds()) , Toast.LENGTH_SHORT).show();
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                1000 * 60 * 0, alarmIntent_1);

    }
}






























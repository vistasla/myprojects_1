package com.example.myclock;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.widget.Toast;

public class CreateAlarm {
    public CreateAlarm(Context context){
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        AlarmManager.AlarmClockInfo alarmClockInfo=new AlarmManager.AlarmClockInfo(0,null);
        /*Intent intent = new Intent(context, MediaPlayerActivity.class);
        PendingIntent alarmIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_IMMUTABLE);*/
        /*Intent intent = new Intent(context, MediaPlayerService.class);
        PendingIntent alarmIntent = PendingIntent.getService(context, 0, intent, PendingIntent.FLAG_IMMUTABLE);*/
        Intent intent = new Intent(context,AlarmReceiver.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_IMMUTABLE);
        Calendar calendar = Calendar.getInstance();
        //calendar.setTimeInMillis(System.currentTimeMillis());
        /*alarmManager.setAlarmClock (alarmClockInfo,null);*/
        /*alarmManager.set (RTC_WAKEUP,0,null);*/
        /*alarmManager.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                SystemClock.elapsedRealtime() + AlarmManager.INTERVAL_HALF_HOUR,
                AlarmManager.INTERVAL_HALF_HOUR, null);*/

        /*true*/
        /*
        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,SystemClock.elapsedRealtime() +
                        10 * 1000, alarmIntent);*/

        //calendar.set(calendar.HOUR_OF_DAY,calendar.getTime().getHours() );
        calendar.set(calendar.MINUTE, calendar.getTime().getMinutes()+1);
        calendar.set(calendar.SECOND, 0);
        calendar.set(calendar.MILLISECOND, 0);
        //Toast.makeText(context,"HOURS:"+ String.valueOf(calendar.getTime().getHours()), Toast.LENGTH_SHORT).show();
        Toast.makeText(context,"MINUTES:"+String.valueOf(calendar.getTime().getMinutes()) , Toast.LENGTH_SHORT).show();
        Toast.makeText(context,"SECONDS:"+String.valueOf(calendar.getTime().getSeconds()) , Toast.LENGTH_SHORT).show();
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                1000 * 60 * 1, alarmIntent);
    }
}






























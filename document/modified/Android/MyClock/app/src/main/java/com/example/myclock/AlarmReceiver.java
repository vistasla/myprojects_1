package com.example.myclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context, "AlarmReceiver:AlarmReceiver started", Toast.LENGTH_SHORT).show();
        Log.d("AlarmReceiver:","AlarmReceiver started" );
        Calendar calendar = Calendar.getInstance();
        //Toast.makeText(context,"HOURS:"+ String.valueOf(calendar.getTime().getHours()), Toast.LENGTH_SHORT).show();
        Toast.makeText(context,"MINUTES:"+String.valueOf(calendar.getTime().getMinutes()) , Toast.LENGTH_SHORT).show();
        Toast.makeText(context,"SECONDS:"+String.valueOf(calendar.getTime().getSeconds()) , Toast.LENGTH_SHORT).show();
        android.media.MediaPlayer mediaPlayer = android.media.MediaPlayer.create(context, R.raw.r_20230328_182940);
        mediaPlayer.start();
        //throw new UnsupportedOperationException("Not yet implemented");

    }
}
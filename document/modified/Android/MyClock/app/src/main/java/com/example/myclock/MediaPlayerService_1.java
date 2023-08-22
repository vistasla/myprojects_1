package com.example.myclock;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.IBinder;
import android.widget.Toast;

public class MediaPlayerService_1 extends Service {
    public MediaPlayerService_1() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public int onStartCommand(Intent intent0, int flags, int startId) {
        Context context=getApplicationContext();
        Calendar calendar = Calendar.getInstance();
        //Toast.makeText(context,"HOURS:"+ String.valueOf(calendar.getTime().getHours()), Toast.LENGTH_SHORT).show();
        Toast.makeText(context,"MINUTES:"+String.valueOf(calendar.getTime().getMinutes()) , Toast.LENGTH_SHORT).show();
        Toast.makeText(context,"SECONDS:"+String.valueOf(calendar.getTime().getSeconds()) , Toast.LENGTH_SHORT).show();
        android.media.MediaPlayer mediaPlayer = android.media.MediaPlayer.create(context, R.raw.r_20230328_182940);
        mediaPlayer.start();
        return  START_STICKY;
    }
}
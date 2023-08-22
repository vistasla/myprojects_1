package com.example.myapplication;

import android.content.Intent;
import android.icu.util.Calendar;
import android.provider.AlarmClock;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class CreateAlarm extends AppCompatActivity {
    //public Intent intent;
    //public class CreateAlarm  {

    public  CreateAlarm(String message, int hour, int minutes){

        /*Uri uri;
        uri = MediaStore.Images.Media.getContentUri(MediaStore.VOLUME_EXTERNAL);*/

        ArrayList arrayList=new ArrayList();
        //List list=new ArrayList();
        arrayList.add(Calendar.MONDAY);
        arrayList.add(Calendar.FRIDAY);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
         /*intent = new Intent(AlarmClock.ACTION_SET_ALARM)*/
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
               /*.putExtra(AlarmClock.EXTRA_RINGTONE,uri)*/
                .putExtra(AlarmClock.EXTRA_RINGTONE,"cesium")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                ;


        Log.d("intent_Action", intent.getAction());
        startActivity(intent);
      /*if (intent.resolveActivity( getPackageManager()) != null) {
          Log.d("IsAlarmClockAvailable", "true");
           // startActivity(intent);

        }else{
            Log.d("IsAlarmClockAvailable", "false");

        }*/

        /*ContextCompat.startActivity(intent);*/

    }



}
    /*CreateAlarm createAlarm=new CreateAlarm("myAlarm_1",12,12);
    startActivity(createAlarm.intent);*/
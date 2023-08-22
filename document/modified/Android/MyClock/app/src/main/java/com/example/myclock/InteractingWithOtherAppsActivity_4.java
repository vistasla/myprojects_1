package com.example.myclock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;

import java.io.IOException;
import java.util.ArrayList;

public class InteractingWithOtherAppsActivity_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interacting_with_other_apps4);
    }
    public void sendMessage(View view) throws IOException {
        ArrayList arrayList=new ArrayList();

        arrayList.add(Calendar.MONDAY);
        arrayList.add(Calendar.TUESDAY);
        arrayList.add(Calendar.WEDNESDAY);
        arrayList.add(Calendar.THURSDAY);
        arrayList.add(Calendar.FRIDAY);
        arrayList.add(Calendar.SATURDAY);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "title")
                .putExtra(AlarmClock.EXTRA_HOUR, 0)
                .putExtra(AlarmClock.EXTRA_MINUTES, 0)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                ;
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        startActivity(intent);

        ArrayList arrayList1=new ArrayList();

        arrayList1.add(Calendar.MONDAY);
        arrayList1.add(Calendar.TUESDAY);
        arrayList1.add(Calendar.WEDNESDAY);
        arrayList1.add(Calendar.THURSDAY);
        arrayList1.add(Calendar.FRIDAY);
        arrayList1.add(Calendar.SATURDAY);

        Intent intent1 = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "title")
                .putExtra(AlarmClock.EXTRA_HOUR, 1)
                .putExtra(AlarmClock.EXTRA_MINUTES, 0)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList1)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                ;
        intent1.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent1);

        ArrayList arrayList2=new ArrayList();

        arrayList2.add(Calendar.MONDAY);
        arrayList2.add(Calendar.TUESDAY);
        arrayList2.add(Calendar.WEDNESDAY);
        arrayList2.add(Calendar.THURSDAY);
        arrayList2.add(Calendar.FRIDAY);
        arrayList2.add(Calendar.SATURDAY);

        Intent intent2 = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "title")
                .putExtra(AlarmClock.EXTRA_HOUR, 2)
                .putExtra(AlarmClock.EXTRA_MINUTES, 0)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList2)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                ;
        intent2.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent2);
    }
}
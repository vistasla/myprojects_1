package com.example.myclock;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreateAlarmActivity_1 extends AppCompatActivity {
    //String[] alarmTitleArray={"第","节","课","下","放学","了","早","中","晚","餐","一","二","三","四","五","六","七","八","九","十","十一","十二",};
    String[] alarmTitleArray={"第","节","课","下","放学","了","早","中","晚","餐","一","二","三","四","五","六","七","八","九","十","",""};
    //Intent[] intentArray={null};
    //Intent[] intentArray={};
    //Intent intentArray[12];
    Intent[] intentArray=new Intent[12];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        alarmTitleArray[20]=alarmTitleArray[19]+alarmTitleArray[10];
        alarmTitleArray[21]=alarmTitleArray[19]+alarmTitleArray[11];
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_alarm);
    }
    protected void onStart() {
        super.onStart();
        Log.d("CreateAlarmActivity", "onStart");
    }
    protected void onResume() {
        super.onResume();
        Log.d("CreateAlarmActivity", "onResume");
    }
    protected void onPause() {
        super.onPause();
        Log.d("CreateAlarmActivity", "onPause");
    }
    protected void onStop() {
        super.onStop();
        Log.d("CreateAlarmActivity", "onStop");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d("CreateAlarmActivity", "onRestart");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CreateAlarmActivity", "onDestroy");
    }
    public void createAlarm(String title, int hours, int minutes) throws InterruptedException {

        ArrayList arrayList=new ArrayList();

        arrayList.add(Calendar.MONDAY);
        arrayList.add(Calendar.TUESDAY);
        arrayList.add(Calendar.WEDNESDAY);
        arrayList.add(Calendar.THURSDAY);
        arrayList.add(Calendar.FRIDAY);
        arrayList.add(Calendar.SATURDAY);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, title)
                .putExtra(AlarmClock.EXTRA_HOUR, hours)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                //.putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,true)
                /*.putExtra(AlarmClock.ACTION_DISMISS_ALARM,true)*/
                ;

        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        startActivity(intent);
        //startActivityForResult(intent,0);
        //finish();

         /*void onActivityResult(){
        Log.d("createAlarm:", "completed");
        }*/

        Thread.currentThread().sleep(1500);
        Log.d("after:",String.valueOf(new Date().getSeconds()) );
        ActivityManager activityManager=getSystemService(ActivityManager.class);
        List<ActivityManager.AppTask> appTaskList=activityManager.getAppTasks();
        appTaskList.get(0).moveToFront();
        Thread.currentThread().sleep(1000);

        //finish();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("requested activity:", "returned");
        Log.d("requested activity return:", String.valueOf(resultCode));
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == RESULT_OK) {
            Log.d("requested activity return:",String.valueOf(resultCode));
        }
    }
    public void createAlarm_1(String title, int hours, int minutes){
        class CreateAlarmThread extends Thread {
            public void run() {
                ArrayList arrayList=new ArrayList();

                arrayList.add(Calendar.MONDAY);
                arrayList.add(Calendar.TUESDAY);
                arrayList.add(Calendar.WEDNESDAY);
                arrayList.add(Calendar.THURSDAY);
                arrayList.add(Calendar.FRIDAY);
                arrayList.add(Calendar.SATURDAY);

                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                        .putExtra(AlarmClock.EXTRA_MESSAGE, title)
                        .putExtra(AlarmClock.EXTRA_HOUR, hours)
                        .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                        .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                        .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                        .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                        .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                        ;
                startActivity(intent);
            }
        }
        CreateAlarmThread createAlarmThread=new CreateAlarmThread();
        createAlarmThread.start();
    }
    public void createAlarm_2(String title, int hours, int minutes){
        Context context=getApplicationContext();
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        AlarmManager.AlarmClockInfo alarmClockInfo=new AlarmManager.AlarmClockInfo(0,null);
        //PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, null, PendingIntent.FLAG_IMMUTABLE);
        /*alarmManager.setAlarmClock (alarmClockInfo,null);*/
        /*alarmManager.set (RTC_WAKEUP,0,null);*/
        /*alarmManager.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                SystemClock.elapsedRealtime() + AlarmManager.INTERVAL_HALF_HOUR,
                AlarmManager.INTERVAL_HALF_HOUR, null);*/

        PendingIntent alarmIntent;
        Intent intent = new Intent(context, MediaPlayerActivity.class);
        alarmIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_IMMUTABLE);
        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                SystemClock.elapsedRealtime() +
                        10 * 1000, alarmIntent);
    }
    public Intent createIntent(String title, int hours, int minutes){

        ArrayList arrayList=new ArrayList();

        arrayList.add(Calendar.MONDAY);
        arrayList.add(Calendar.TUESDAY);
        arrayList.add(Calendar.WEDNESDAY);
        arrayList.add(Calendar.THURSDAY);
        arrayList.add(Calendar.FRIDAY);
        arrayList.add(Calendar.SATURDAY);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, title)
                .putExtra(AlarmClock.EXTRA_HOUR, hours)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                .putExtra(AlarmClock.EXTRA_RINGTONE,"Argon")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                ;
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return  intent;

    }
    public void dismissAlarm()  {

        Intent intent = new Intent(AlarmClock.ACTION_DISMISS_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "title")
                .putExtra(AlarmClock.EXTRA_ALARM_SEARCH_MODE,AlarmClock.ALARM_SEARCH_MODE_LABEL)
                //.putExtra(AlarmClock.EXTRA_ALARM_SEARCH_MODE, "android.label")
                ;

        startActivity(intent);
    }
    public void snoozeAlarm()  {

        Intent intent = new Intent(AlarmClock.ACTION_SNOOZE_ALARM)
                .putExtra(AlarmClock.EXTRA_ALARM_SNOOZE_DURATION, 5)
                ;

        startActivity(intent);
    }
    public void parseDocument(String url) throws IOException, SAXException {
        MyDocumentBuilder myDocumentBuilder=new MyDocumentBuilder();
        Document document=myDocumentBuilder.parse(url);
        System.out.println(document.getTextContent());
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("requested activity returned:", String.valueOf(resultCode));
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == RESULT_OK) {
            Log.d("requested activity returned:",String.valueOf(resultCode));
        }
    }*/

    public int[] getSunsetTime(){
        int[] intArray=new int[2];
        //EditText = ((EditText) findViewById(R.id.editTextNumber2)).getText();
        //String strSunsetTime_HOURS=getText(R.id.editTextNumber2).toString();
        String strSunsetTime_HOURS=((EditText) findViewById(R.id.editTextNumber2)).getText().toString();
        StringToIntTypeCast stringToIntTypeCast=new StringToIntTypeCast(strSunsetTime_HOURS);
        int SunsetTime_HOURS=stringToIntTypeCast.intA;
        String strSunsetTime_MINUTES=((EditText) findViewById(R.id.editTextNumber3)).getText().toString();
        StringToIntTypeCast stringToIntTypeCast_1=new StringToIntTypeCast(strSunsetTime_MINUTES);
        int SunsetTime_MINUTES=stringToIntTypeCast_1.intA;
        intArray[0]=SunsetTime_HOURS;
        intArray[1]=SunsetTime_MINUTES;
        return  intArray;

        //findViewById(R.id.editTextNumber2) as EditText;
        /*
        int SunsetTime_SECONDS=0;*/



        /*WebView webView=new WebView(getApplicationContext());
        String weatherString="https://weathernew.pae.baidu.com/weathernew/pc?query=%E6%B2%B3%E5%8D%97%E9%83%91%E5%B7%9E%E5%A4%A9%E6%B0%94&srcid=4982&forecast=long_day_forecast";
        webView.loadUrl(weatherString);*/
    }
    public void computeTime(int SunsetTime_HOURS, int SunsetTime_MINUTES) throws InterruptedException {
        /*Time time=new Time(0,0,0);
        time.setTime();*/
        int SunsetTime_HOURS_1=SunsetTime_HOURS;
        int SunsetTime_MINUTES_1=SunsetTime_MINUTES;
        for (int i = 23; i >= -1; i--) {
            if(i==23){
                Log.d("i:", String.valueOf(i));
                if(SunsetTime_MINUTES_1>=30){
                    SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-30;
                    createAlarm(alarmTitleArray[4]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                    Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                    Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                }
                else{
                    SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                    SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+30;
                    createAlarm(alarmTitleArray[4]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                    Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                    Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                }
            }
            else{
                if(i==11){
                    Log.d("i11:", String.valueOf(i));
                    if(SunsetTime_MINUTES_1>=30){
                        SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                        SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-30;
                        createAlarm(alarmTitleArray[0]+alarmTitleArray[15]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                        Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                        Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));

                    }
                    else{
                        SunsetTime_HOURS_1=SunsetTime_HOURS_1-2;
                        SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+30;
                        createAlarm(alarmTitleArray[0]+alarmTitleArray[15]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                        Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                        Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                    }
                }
                else{
                    if(i==-1){
                        Log.d("i:", String.valueOf(i));
                        SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                        createAlarm(alarmTitleArray[6]+alarmTitleArray[9], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                        Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                        Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                        Toast.makeText(this,"CreateAlarm Completed.", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        if(i%2==0){
                            Log.d("i:", String.valueOf(i));
                            if(SunsetTime_MINUTES_1>=40){
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-40;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[i/2+10]+alarmTitleArray[1]+alarmTitleArray[2], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                            else{
                                SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+20;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[i/2+10]+alarmTitleArray[1]+alarmTitleArray[2], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                        }
                        else{
                            Log.d("i:", String.valueOf(i));
                            if(SunsetTime_MINUTES_1>=10){
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-10;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[(i+1)/2+9]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                            else{
                                SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+50;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[(i+1)/2+9]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                        }

                    }
                }

            }

        }

    }
    public void sendMessage(View view) throws IOException, InterruptedException {
        //computeTime(getSunsetTime()[0],getSunsetTime()[1]);

        /*Intent intent=new Intent(this, InteractingWithOtherAppsActivity.class);
        startActivity(intent);*/
        /*Intent intent=new Intent(this, WeatherActivity.class);
        startActivity(intent);*/
        //CreateAlarm createAlarm=new CreateAlarm(getApplicationContext());
        //CreateAlarm_1 createAlarm_1=new CreateAlarm_1(getApplicationContext());
        /*for (int i = 0; i < 3; i++) {
            CreateAlarmThread createAlarmThread=new CreateAlarmThread();
            createAlarmThread.run(getApplicationContext() , i);
        }*/

        //MediaPlayer mediaPlayer=new MediaPlayer(getApplicationContext());
        //getSunsetTime();
        //createAlarm_1();
        //parseDocument("https://developer.android.google.cn/reference/android/provider/AlarmClock?hl=en");
        //dismissAlarm();
        //snoozeAlarm();
    }
}
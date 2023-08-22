package com.example.myclock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;

public class InteractingWithOtherAppsActivity_1 extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interacting_with_other_apps1);
    }
    public void sendMessage(View view) throws IOException {
        for (int i = 0; i <12 ; i++) {
            Log.d("i:", String.valueOf(i));
            intent=new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.addCategory("android.intent.category.APP_MUSIC");
            intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            /*intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);*/
            intent.putExtra("inta",i);
            startActivity(intent);
        }
    }
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("onNewIntent:","onNewIntent" );
    }
}
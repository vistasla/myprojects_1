package com.example.myclock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;

public class InteractingWithOtherAppsActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interacting_with_other_apps2);
    }
    public void sendMessage(View view) throws IOException {
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.addCategory("android.intent.category.APP_MUSIC");
        //intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.putExtra("inta",0);
        startActivity(intent);

        Intent intent1=new Intent();
        intent1.setAction(Intent.ACTION_SEND);
        intent1.setType("text/plain");
        intent1.addCategory("android.intent.category.APP_MUSIC");
        //intent1.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent1.putExtra("inta",1);
        startActivity(intent1);

        Intent intent2=new Intent();
        intent2.setAction(Intent.ACTION_SEND);
        intent2.setType("text/plain");
        intent2.addCategory("android.intent.category.APP_MUSIC");
        //intent2.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent2.putExtra("inta",2);
        startActivity(intent2);
        }
    }

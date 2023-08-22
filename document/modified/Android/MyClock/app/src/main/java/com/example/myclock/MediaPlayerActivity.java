package com.example.myclock;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;

import java.io.IOException;

public class MediaPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);

        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.r_20230328_182940);
        mediaPlayer.start();
    }
    protected void onStart() {
        super.onStart();
        Log.d("MediaPlayerActivity", "onStart");
    }
    protected void onResume() {
        super.onResume();
        Log.d("MediaPlayerActivity", "onResume");
    }
    protected void onPause() {
        super.onPause();
        Log.d("MediaPlayerActivity", "onPause");
    }
    protected void onStop() {
        super.onStop();
        Log.d("MediaPlayerActivity", "onStop");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d("MediaPlayerActivity", "onRestart");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MediaPlayerActivity", "onDestroy");

    }

    /*public void play(View view)throws IOException{
        Log.d("MediaPlayerActivity", "play()");
        *//*String strUri="/storage/emulated/0/Movies/VID_20230330_123351.mp4";
        Uri myUri = Uri.parse(strUri);
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.setDataSource(getApplicationContext(), myUri);
        mediaPlayer.prepare();
        mediaPlayer.start();*//*
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.r_20230328_182940);
        //mediaPlayer.setDisplay();
        mediaPlayer.start();
    }*/
}
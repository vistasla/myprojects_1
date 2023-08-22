package com.example.myclock;

import android.content.Context;
import android.os.Bundle;

public class MediaPlayer {

    public MediaPlayer(Context context) {
        android.media.MediaPlayer mediaPlayer = android.media.MediaPlayer.create(context, R.raw.r_20230328_182940);
        mediaPlayer.start();
    }
}

package com.example.myclock;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MediaStore_Audios_query_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_store_audios_query);
    }
    public void sendMessage(View view) throws IOException, InterruptedException {
        Uri collectionUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] projection = new String[] {
                MediaStore.Audio.Media._ID,
                MediaStore.Audio.Media.DISPLAY_NAME,
                MediaStore.Audio.Media.DURATION,
                MediaStore.Audio.Media.SIZE
        };
        String selection = MediaStore.Audio.Media.SIZE +
                " >= ?";
        String[] selectionArgs = new String[] {
                String.valueOf(0)};
        String sortOrder = MediaStore.Audio.Media.DISPLAY_NAME + " ASC";
        ContentResolver contentResolver=getApplicationContext().getContentResolver();
        Cursor cursor = contentResolver.query(
                collectionUri,
                null,
                null,
                null,
                null);
        Toast.makeText(getApplicationContext(),"cursor.getCount()"+cursor.getCount() , Toast.LENGTH_SHORT).show();
        int i=0;
        while (cursor.moveToNext()) {
            String data = cursor.getString(32);
            Uri uri=Uri.parse(data);
            System.out.println("i:"+uri);
            i++;
            Thread.sleep(1000);
        }
    }
}
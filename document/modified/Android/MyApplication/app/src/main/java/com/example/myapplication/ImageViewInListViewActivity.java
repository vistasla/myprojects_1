package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageViewInListViewActivity extends AppCompatActivity {

    //public ImageView[] imageViewArray={};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_in_list_view);

        ImageView imageView=(ImageView)findViewById(R.id);

        ArrayAdapter<ImageView> imageViewArrayAdapter=new ArrayAdapter<ImageView>(ImageViewInListViewActivity.this, R.layout.myimageview,imageViewArray);
        ListView listView=findViewById(R.id.imageView8);
        listView.setAdapter(imageViewArrayAdapter);
    }
}
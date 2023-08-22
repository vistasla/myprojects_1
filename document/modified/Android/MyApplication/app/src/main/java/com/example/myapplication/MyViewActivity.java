package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MyViewActivity extends AppCompatActivity {
public String[] stringarray={"item0","item0","item0","item0","item0","item0","item0","item0","item0","item0","item0","item0"};
    /*stringarray[0]="item0";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_view);

        //ArrayAdapter<String> strarrAdapter=new ArrayAdapter<String>(MyView.this, android.R.layout.simple_list_item_1,stringarray);
        ArrayAdapter<String> strarrAdapter=new ArrayAdapter<String>(MyViewActivity.this, R.layout.mylistview,stringarray);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(strarrAdapter);
    }
}
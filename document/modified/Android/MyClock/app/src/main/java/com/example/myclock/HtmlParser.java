package com.example.myclock;

import android.content.Context;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class HtmlParser {
    public HtmlParser(Context context) throws MalformedURLException {

        //File file=new File("/storage/emulated/0/text/weather.html");
        //false
        /*File file=new File("res/raw/weather.html");
        Toast.makeText(context, "file.exists()"+String.valueOf(file.exists()), Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "file.canRead()"+String.valueOf(file.canRead()), Toast.LENGTH_SHORT).show();*/
        /*Document doc = Jsoup.connect("https://developer.android.google.cn/reference").get();
        Toast.makeText(context,"title:"+doc.title() , Toast.LENGTH_SHORT).show();*/
        URL url=new URL("https://developer.android.google.cn/reference");
        Document doc = null;
        try {
            doc = Jsoup.parse(url,3000);
        } catch (IOException e) {
            //Toast.makeText(context,"IOException:"+e.getMessage() , Toast.LENGTH_SHORT).show();
            //Toast.makeText(context,"IOException:" , Toast.LENGTH_SHORT).show();
            System.out.println("IOException:");
            //throw new RuntimeException(e);
        }
    }
}

package javaio;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HtmlParser {
	
    public HtmlParser() throws IOException  {
    	
    	//true
        //Document doc = Jsoup.connect("https://developer.android.google.cn/reference").get();
    	//Document doc = Jsoup.connect("https://cn.bing.com/").get();
        //Document doc = Jsoup.connect("https://m.baidu.com/s?pu=sz%401320_480%2Ccuid%40_iSdiluHS8_ruSaMlaHfulae-f0ii2i2ja2lf_upvfKoLqqqB%2Ccua%40_a-qiyauvigyNE65I5me6NN0v8oZa2I4_C2Hiyat2iqlC%2Cosname%40baiduboxapp%2Cctv%402%2Ccfrom%401026904e%2Ccen%40cuid_cua%2Cc3_aid%40A00-GP47OBUNI5STZFQ5WARR4CIKUSMXF4UG-YY4Y6UHU%2Ccsrc%40home_box_txt&bd_page_type=1&word=%E5%A4%A9%E6%B0%94&from=1013672z&pkgname=com.baidu.searchbox&p_sv=33&mpv=1&branchname=baiduboxapp&ds_stc=0.6997&ds_lv=7&network=1_-1&ss=110000000000000000000000000&feedsa=1_0&sugid=130687685407770&source=hissug&sa=ikb&rq=%E5%A4%A9%E6%B0%94&rsv_pq=16809542209594542269&ant_ct=VgiLp%2F7JII9Mhd5AOtxIEL8Z2G3lJ3LO12jzlXFC8TX0dyp9OrowjbpEO62Kx0yN&t_samp=tcspeedup_0-aiapps_10050-fixhttpdns_0-load_async_k_0-Prefetch_NA_101&tcs=4255727_S10&shared_from_app=1").get();
      
        //true
		/*
		 * URL url=new URL("https://developer.android.google.cn/reference"); 
		 * Document doc =Jsoup.parse(url,3000); 
		 * System.out.println("title:"+doc.title());
		 * System.out.println(":"+doc.getElementsByClass("").first( ).text());
		 */
		  			
    	//local true
        //File file=new File("/storage/emulated/0/text/weather.html");
		  File file=new File("D:\\myprojects\\io\\input\\weather.html");
		  
		  System.out.println("file.exists()"+file.exists());
		  System.out.println("file.canRead()"+file.canRead());
		  
		  Document doc =Jsoup.parse(file);
		  
		  System.out.println("title:"+doc.title());
          System.out.println("SunsetTime:"+doc.getElementsByClass("time_3p7ft num_3De1N").text());
        
       //local true
	   //System.out.println(":"+doc.getElementsByClass("time_3p7ft num_3De1N").html());
       //local true
	   //System.out.println(":"+doc.getElementsByClass("time_3p7ft num_3De1N").hasText());
	   //false  
	   //System.out.println(":"+doc.getElementsByClass("time_3p7ft num_3De1N").val());
       //local true
       //System.out.println("getElementsByClass:"+doc.getElementsByClass("time_3p7ft num_3De1N").tagName("span"));
       //System.out.println("title:"+doc.getElementsByClass("time_3p7ft num_3De1N").parents().get(0));
        
    }
    public static void main(String[] args) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		HtmlParser htmlParser=new HtmlParser();
	}
    
}

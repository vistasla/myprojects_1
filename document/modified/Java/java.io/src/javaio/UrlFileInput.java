package javaio;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlFileInput {

	public UrlFileInput() throws URISyntaxException, IOException {
		// TODO Auto-generated constructor stub
		// https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2023-03/R/eclipse-java-2023-03-R-win32-x86_64.zip
		
		//URL url = new URL("https://www.editplus.com/ftp/epp570_4352_64bit.exe");
		//URL url = new URL("https://m.baidu.com/s?pu=sz%401320_480%2Ccuid%40_iSdiluHS8_ruSaMlaHfulae-f0ii2i2ja2lf_upvfKoLqqqB%2Ccua%40_a-qiyauvigyNE65I5me6NN0v8oZa2I4_C2Hiyat2iqlC%2Cosname%40baiduboxapp%2Cctv%402%2Ccfrom%401026904e%2Ccen%40cuid_cua%2Cc3_aid%40A00-GP47OBUNI5STZFQ5WARR4CIKUSMXF4UG-YY4Y6UHU%2Ccsrc%40home_box_txt&bd_page_type=1&word=%E5%A4%A9%E6%B0%94&from=1013672z&pkgname=com.baidu.searchbox&p_sv=33&mpv=1&branchname=baiduboxapp&ds_stc=0.6997&ds_lv=7&network=1_-1&ss=110000000000000000000000000&feedsa=1_0&sugid=130687685407770&source=hissug&sa=ikb&rq=%E5%A4%A9%E6%B0%94&rsv_pq=16809542209594542269&ant_ct=VgiLp%2F7JII9Mhd5AOtxIEL8Z2G3lJ3LO12jzlXFC8TX0dyp9OrowjbpEO62Kx0yN&t_samp=tcspeedup_0-aiapps_10050-fixhttpdns_0-load_async_k_0-Prefetch_NA_101&tcs=4255727_S10&shared_from_app=1");
		//URL url = new URL("https://www.msn.cn/zh-cn/weather/forecast/in-%E6%B2%B3%E5%8D%97%E7%9C%81,%E9%83%91%E5%B7%9E%E5%B8%82?loc=eyJsIjoi5Lit5Y6f5Yy6IiwiciI6Iuays%2BWNl%2BecgSIsInIyIjoi6YOR5bee5biCIiwiYyI6IuS4reWNjuS6uuawkeWFseWSjOWbvSIsImkiOiJDTiIsImciOiJ6aC1jbiIsIngiOiIxMTMuNTY4IiwieSI6IjM0LjgxOSJ9&ocid=ansmsnweather&weadegreetype=C");		
		URL url = new URL("https://www.baidu.com/index.php");
		//String outputFilePathString = "D:\\myprojects\\io\\output\\java_output.exe";
		String outputFilePathString = "D:\\myprojects\\io\\output\\java_output.php";
		InputStream inputStream = url.openStream();
		File outputFile = new File(outputFilePathString);
		FileOutputStream fileOutputStream = new FileOutputStream(outputFilePathString);

		byte[] bytes = new byte[1024];
		int i;
		while ((i = inputStream.read(bytes)) != -1) {

			fileOutputStream.write(bytes, 0, i);
			fileOutputStream.flush();

		}

		inputStream.close();
		fileOutputStream.close();

		System.out.print("UrlFileInput:" + "completed");

	}

	public static void main(String[] args) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		UrlFileInput urlFileInput = new UrlFileInput();
	}

}

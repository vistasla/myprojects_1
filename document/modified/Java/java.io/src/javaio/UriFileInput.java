package javaio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UriFileInput {

	public UriFileInput() throws IOException, URISyntaxException {
		// TODO Auto-generated constructor stub
		// URI uri=new
		// URI("https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-09/R/eclipse-inst-jre-win64.exe");

		// false:Exception in thread "main" java.lang.IllegalArgumentException: URI
		// scheme is not "file"
		// URI uri=new URI("https://www.editplus.com/ftp/epp570_4352_64bit.exe");
		// false Exception in thread "main" java.lang.IllegalArgumentException: URI
		// scheme is not "file"
		// URI uri=new URI("https:////www.editplus.com//ftp//epp570_4352_64bit.exe");
		// false
		// URI uri=new URI("https:\\www.editplus.com\ftp\epp570_4352_64bit.exe");
		// false Exception in thread "main" java.net.URISyntaxException: Illegal
		// character in opaque part at index 6:
		// https:\\www.editplus.com\ftp\epp570_4352_64bit.exe
		// URI uri=new URI("https:\\\\www.editplus.com\\ftp\\epp570_4352_64bit.exe");

		// false:Exception in thread "main" java.net.URISyntaxException: Illegal
		// character in opaque part at index 2: D:\myprojects\io\input\java_input.exe
		// URI uri=new URI("D:\\myprojects\\io\\input\\java_input.exe");
		// false:Exception in thread "main" java.net.URISyntaxException: Illegal
		// character in opaque part at index 2: D:\myprojects\io\input\java_input.exe
		// URI uri=new URI("D:\\\\myprojects\\\\io\\\\input\\\\java_input.exe");
		// true
		// file.toURI():file:/D:/myprojects/io/input/java_input.exe

		/*
		 * uri.getRawPath() uri.toURL()
		 */

		// System.out.println("uri:"+uri.getScheme()+","+uri.getHost()+","+uri.getAuthority()+","+uri.getPath()+","+uri.getPort());
		// System.out.println("file.exists():"+file.exists());
		
		/*
		 * String outputFilePathString = "D:\\myprojects\\io\\output\\java_output.exe";
		 * InputStream inputStream = url.openStream(); File outputFile = new
		 * File(outputFilePathString); FileOutputStream fileOutputStream = new
		 * FileOutputStream(outputFilePathString);
		 * 
		 * OutputStream outputStream=new OutputStream(); outputStream.write(bytes);
		 * 
		 * byte[] bytes = new byte[1024]; int i; while ((i = inputStream.read(bytes)) !=
		 * -1) {
		 * 
		 * fileOutputStream.write(bytes, 0, i); fileOutputStream.flush();
		 * 
		 * }
		 * 
		 * inputStream.close(); fileOutputStream.close();
		 */

		System.out.print("UriFileInput:" + "completed");
	}

	public static void main(String[] args) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		UriFileInput uriFileInput = new UriFileInput();
	}

}

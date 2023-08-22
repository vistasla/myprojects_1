package javaio;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class FileThread {

	public FileThread() throws IOException, URISyntaxException, InterruptedException {
		// TODO Auto-generated constructor stub

		// file1.createTempFile("prefix","suffix",file );
		// while
		// ((Thread.State.valueOf(pathString).compareTo(Thread.State.TERMINATED))!=1) {
		/*
		 * Thread thread=new Thread("newthread"); thread.sleep(1000*3); thread.start();
		 */
		String pathString = "D:\\myprojects\\source\\file\\output\\Temp";
		File file1 = new File(pathString);
		while (Thread.activeCount() == 1) {

			System.out.println(Thread.currentThread());
			System.out.println(Thread.currentThread().getStackTrace());

			// System.out.println(Thread.activeCount());

		}
		file1.deleteOnExit();

		System.out.println("FileThread:" + "completed");

	}

	public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
		// TODO Auto-generated method stub
		FileThread fileThread = new FileThread();
	}

}

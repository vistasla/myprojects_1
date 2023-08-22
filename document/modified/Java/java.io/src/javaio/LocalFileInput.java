package javaio;

import java.io.*;

public class LocalFileInput {

	public LocalFileInput() throws IOException {
		// TODO Auto-generated constructor stub		
		String inputFilePathString = "D:\\myprojects\\io\\input\\java_input.exe";
		String outputFilePathString = "D:\\myprojects\\io\\output\\java_output.exe";
		File inputFile = new File(inputFilePathString);
		File outputFile = new File(outputFilePathString);
		byte[] bytes = new byte[1024];
		int i;
		FileInputStream fileInputStream = new FileInputStream(inputFile);
		FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
		while ((i = fileInputStream.read(bytes)) != -1) {

			fileOutputStream.write(bytes, 0, i);
			fileOutputStream.flush();

		}

		fileInputStream.close();
		fileOutputStream.close();

		System.out.print("LocalFileInput:" + "completed");

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LocalFileInput localFileInput = new LocalFileInput();
	}

}

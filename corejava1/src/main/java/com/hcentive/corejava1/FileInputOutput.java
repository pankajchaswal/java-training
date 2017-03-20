package com.hcentive.corejava1;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInputOutput {
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(Paths.get("C:/data/personal/WS/training/corejava1/src/main/java/com/hcentive/corejava1/myfile.txt"));
		System.out.println(in.next());
		in.close();
	}

}

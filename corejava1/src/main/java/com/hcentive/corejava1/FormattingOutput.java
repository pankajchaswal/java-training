package com.hcentive.corejava1;

public class FormattingOutput {
	public static void main(String[] args) {
		double x = 10000.0 / 3.0;
		System.out.println(x);
		System.out.printf("%8.2f", x);
		System.out.printf("\n Hello, %s. Next year, you'll be %d", "Java", 22);
	}
}

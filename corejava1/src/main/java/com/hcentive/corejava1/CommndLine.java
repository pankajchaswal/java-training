package com.hcentive.corejava1;

public class CommndLine {

	public static void main(String[] args) {
		if (args[0].equals("-h"))
			System.out.print("Hello,");
		else if (args[0].equals("-g"))
			System.out.print("Goodbye,");
		// print the other command-line arguments
		for (int i = 1; i < args.length; i++)
			System.out.print(" " + args[i]);
		System.out.println("!");
	}

}

package com.hcentive.corejava1;

public class Loops {

	public static void main(String[] args) {
		int count = 1;
		while (count < 11) {
			System.out.println("Count is: " + count);
			count++;
		}

		count = 1;
		do {
			System.out.println("Count is: " + count);
			count++;
		} while (count < 11);
		
		
		for (int i = 1; i <= 10; i++)
			System.out.println(i);
		
		for (int i = 1; i <= 10; i++){
			System.out.println(i);
			if(i==5){
				break;
			}
		}
			

	}

}

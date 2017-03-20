package com.hcentive.corejava1;

public class Conditional {

	public static void main(String[] args) {
		
		int yourSales = 100;
		int target = 90;

		if (yourSales >= target) {
			String performance = "Satisfactory";
			int bonus = 100;
			System.out.println("Performance : "+performance+ "\n" + "bonus : "+bonus);
		}
	}

}

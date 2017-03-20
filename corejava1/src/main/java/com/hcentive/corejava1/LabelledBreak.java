package com.hcentive.corejava1;

public class LabelledBreak {

	public static void main(String[] args) {

		OuterLoop: for (int i = 2;; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue OuterLoop;
				}
			}
			System.out.println(i);
			if (i == 37) {
				break OuterLoop;
			}
		}
	}

}

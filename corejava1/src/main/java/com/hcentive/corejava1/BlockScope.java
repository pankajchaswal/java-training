package com.hcentive.corejava1;

public class BlockScope {
	
	public static void main(String[] args) {
		int k = 0;
		if(true){
			int i = 0;
			int k = 0;
		}
		System.out.println(i);
	}

}

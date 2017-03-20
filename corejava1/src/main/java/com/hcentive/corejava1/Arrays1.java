package com.hcentive.corejava1;

import java.util.Arrays;

public class Arrays1 {
	
	public static void main(String[] args) {
		
		int[] smallPrimes = new int[] { 17, 19, 23, 29, 31, 37 };
		int[] anonymous = { 37, 17, 19, 23, 29, 31 };
		int[] a = new int[5];
		for (int i = 0; i < 5; i++){
			a[i] = i;
		}
		
		for(int i = 0; i < a.length ; i++){
			System.out.println(a[i]);
		}
		System.out.println("----------------");
		for(int val : a){
			System.out.println(val);
		}
		System.out.println("----------------");
		int[] copiedLuckyNumbers = Arrays.copyOf(smallPrimes, smallPrimes.length);
		for(int val : copiedLuckyNumbers){
			System.out.println(val);
		}
		System.out.println("----------------");
		Arrays.sort(anonymous);
		for(int val : anonymous){
			System.out.println(val);
		}
		
	}

}

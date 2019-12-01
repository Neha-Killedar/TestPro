package com.csi.parallel;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int num[]={51,45,87,95,47,32,15,02,47,365,965,78,20};
		
		System.out.println("\n Before Sorting: ");
		for (int i: num){
			System.out.print(" "+i);
		}
		System.out.println("\n After Sorting");
		Arrays.parallelSort(num);
		for(int i: num){
			System.out.print(" "+i);
		}
		
	}
}

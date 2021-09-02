package org.test;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		int n,temp;
		
		
		int[] a= {10,20,30,40,20,60,30};
		
		System.out.println("Duplicate Values are:");
		for (int i = 0; i <a.length; i++) {
			for (int j =i+1; j <a.length; j++) {
				
				if (a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
			
		}
		
	}
}

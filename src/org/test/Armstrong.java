package org.test;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
		int n,a,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("The numbers are:");
		n=sc.nextInt();
		a=n;
		
		while (a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			}
		if (n==j) {
			System.out.println(j+" is a Armstrong");
		} else {
	        System.out.println("It is not a Armstrong");
		}
		
	}
}

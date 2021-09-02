package org.test;

import java.util.Scanner;

public class PrimeNumber {

public static void main(String[] args) {
	int n;
	Scanner sc =new Scanner(System.in);
	System.out.println("The number is:");
	n=sc.nextInt();
	int count=0;
	
	for (int i = 2; i <=n/2; i++) {
		
		if (n%i==0) {
			count=1;
		}
	}
	if (count==0) {
		System.out.println("It is a Prime No");
	} else {
        System.out.println("It is Not a Prime No");
	}
}
}

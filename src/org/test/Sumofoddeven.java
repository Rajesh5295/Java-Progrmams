package org.test;

public class Sumofoddeven {
	public static void main(String[] args) {
		
		int count=0,counti=0;
		for (int i = 1; i <=100; i++) {
			if (i%2==0) {
				count=count+i;
				
			}else {
				counti=counti+i;
				
			}
		}
		System.out.println("Sum of Even no"+count);
		System.out.println("Sum of odd no"+counti);
	}
}

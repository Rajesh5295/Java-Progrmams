package org.test;

public class CountoddEven {
public static void main(String[] args) {
	
	int count=0,counti=0;
	for (int i = 1; i <=100; i++) {
		if (i%2==0) {
			count=count+1;
			
		}else {
			counti=counti+1;
			
		}
	}
	System.out.println("count of Even no"+count);
	System.out.println("count of odd no"+counti);
}
}

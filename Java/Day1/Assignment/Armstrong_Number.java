package Assignment;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=0,count=0;
		System.out.println("Enter Number");
		n = s.nextInt();
		int temp = n;
		while(temp>0) {
			temp = temp/10;
			count++;
		}
		int sum=0;
		temp = n;
		while(n>0) {
			int rem = n % 10;
			sum +=(Math.pow(rem, count));
			n/=10;
		}
		if(temp == sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("It is Not Armstrong Number");
		}
	}

}

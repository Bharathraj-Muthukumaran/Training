package Assignment;

import java.util.Scanner;

public class Random_Number {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		n  = s.nextInt();
		int n1 = (int)(Math.random()*n);
		System.out.println("Random Number is: "+n1);
	}

}

package Assignment;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter Number");
		n = s.nextInt();
		int temp = n;
		while(n!=0) {
			int rem = n%10;
			sum = sum*10 + rem;
			n /= 10;
		}
		if(temp == sum) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is Not Palindrome");
		}

	}

}

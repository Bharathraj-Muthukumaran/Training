package Assignment;

import java.util.Scanner;

public class Fibonacci_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,n,n1=0,n2=1;
		System.out.println("Enter Number:");
		n = s.nextInt();
		for(i=1;i<=n;i++) {
			System.out.print(n1+" ");
		int temp = n1 + n2;
		n1 = n2;
		n2 = temp;
		}
	}

}

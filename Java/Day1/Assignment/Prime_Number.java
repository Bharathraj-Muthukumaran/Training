package Assignment;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,m=0,flag=0,i;
		System.out.println("Enter Number:");
		n = s.nextInt();
		m = n/2;
		if(n==0 || n==1) {
			System.out.println(n+"is not prime number");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+" is prime number");
			}
		}

	}

}

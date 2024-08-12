package Assignment;

import java.util.*;

public class Factorial_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter Number :");
		n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}

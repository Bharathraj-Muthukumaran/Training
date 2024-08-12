package Assignment;

import java.util.*;

public class Ascii_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Starting Character :");
		char ch=s.next().charAt(0);
		System.out.println("Enter the Ending Character :");
		char ch1=s.next().charAt(0);
		for(int i=(int)ch;i<=(int)ch1;i++)
		{
			System.out.println(i);
		}
	}

}

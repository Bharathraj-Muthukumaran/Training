package Assignment;

import java.util.Scanner;

class student{
	int regno;
	String name;
	int a[] = new int[5];

	student(int regno, String name) {
	this.regno=regno;
	this.name=name;
	}

	int sum;
	String grade;
	float avg;

	void getmarks() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i] = s.nextInt();
		}
		for(int i=0;i<5;i++) {
			sum += a[i];
			avg = sum/5;
			System.out.println(sum);
			System.out.println(avg);
		}
	}
	void grade() {
		
	}


public class grade_calculator {

	public static void main(String[] args) {
		student obj = new student();

	}

}
}

package Assignment;
import java.util.Scanner;

public class Employee{
    public static void main(String[] args) {
        System.out.println("Welcome To Java Program");
        Scanner s = new Scanner(System.in);
        System.out.println("Employee ID");
        int eid = s.nextInt();
        System.out.println("Employee Name : ");
        String n = s.next();

        System.out.println("Employee Salary");
        float s=s.nextFloat();
        System.out.println("Employee ID : "+ eid);
        System.out.println("Employee Name : "+ n);
        System.out.println("Employee Salary : "+ s);
}
}
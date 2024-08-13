package Assignment;

class Employee{
	int employeeid;
	String employeename;
	float employeesalary;
	
	Employee(int employeeid,String employeename,float employeesalary){
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}
	
	void display() {
		System.out.println("Employee Id :" +employeeid);
		System.out.println("Employee Name :" +employeename);
		System.out.println("Employee Salary :" +employeesalary);
	}
}

public class myclass {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Bharath",2000.0f);
		emp1.display();
		
		Employee emp2 = new Employee(102,"Ben",3000.0f);
		emp2.display();

	}

}

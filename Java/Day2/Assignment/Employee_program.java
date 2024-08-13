package Day2;

class Employees{
	String Name;
	String JobTitle;
	int Salary;
	Employees(String Name, String JobTitle, int Salary){
		this.Name = Name;
		this.JobTitle = JobTitle;
		this.Salary = Salary;
	}
	void display() {
		System.out.println("Name : " + Name + "\n" + "JobTitle : " + JobTitle + "\n" + "Salary : " + Salary);
	}
	public void raisesalary(double Percentage) {
		if(Percentage > 0) {
			double Increase = Salary * (Percentage / 100);
			Salary += Increase;
			System.out.println("Salary Increased by " + Percentage + "%");
		}
		else {
			System.out.println("Salary Percentage Should be Positive");
		}
	}
}


public class Employee_program {

	public static void main(String[] args) {
		Employees emp = new Employees("Bharath", "Software Engineer", 80000);
        System.out.println("Employee Details");
		emp.display();
		emp.raisesalary(7);
        System.out.println("Updated Emloyee Details");
        emp.display();


	}

}

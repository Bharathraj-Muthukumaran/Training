package Day4;

class Employee {
    void work() {
        System.out.println("Working");
    }
    double getSalary() {
        return 0.0;
    }
}
class HRManager extends Employee {
    void work() {
        System.out.println("HRManager Working");
    }
    void addEmployee() {
        System.out.println("Add employee");
    }
}
public class employee_program {

	public static void main(String[] args) {
		HRManager hr = new HRManager();
		hr.work();
		hr.addEmployee();
	}
}

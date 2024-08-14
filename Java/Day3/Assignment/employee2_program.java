package Day4;

class Person {
    String firstname,lastname;
    Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    String getFirstName() {
        return firstname;
    }
    String getLastName() {
        return lastname;
    }
}
class Employee extends Person {
    String job;
    int employeeId;
    Employee(String firstname, String lastname, String job, int employeeId) {
        super(firstname, lastname);
        this.job = job;
        this.employeeId = employeeId;
    }
    String getLastName() {
        return lastname + " (" + job + ")";
    }
    int getEmployeeId() {
        return employeeId;
    }
}
public class employee2_program {

	public static void main(String[] args) {
		Employee emp = new Employee("John", "Wick", "Security",84620);
        System.out.println("Employee name: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Employee id: " + emp.getEmployeeId());
	}
}

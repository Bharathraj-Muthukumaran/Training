package Day2;

class person{
	int Age;
	String Name;
	person(int age,String name){
		this.Age = age;
		this.Name = name;
	}
	void display() {
		System.out.println("Name:"+Name);
		System.out.println("Age: "+Age);
	}
}

public class person_program {

	public static void main(String[] args) {
		person obj1 = new person(21,"Bharath");
		person obj2 = new person(25,"John");
		obj1.display();
		obj2.display();
	}

}

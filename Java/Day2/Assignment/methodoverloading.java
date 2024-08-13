package Assignment;

public class methodoverloading {

	void method1(String name) {
		System.out.println("Welcome "+name);
	}
	void method1(int a,int b) {
		System.out.println("Sum: "+(a+b));
	}
	void method1(int n) {
		System.out.println("sum : "+(n+n));
	}
	public static void main(String[] args) {
		methodoverloading obj = new methodoverloading();
		obj.method1(5);
		obj.method1("Bharath");
		obj.method1(10,20);
	}

}

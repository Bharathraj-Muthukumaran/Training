package Assignment;

public class methods {

	void method1() {
		System.out.println("Instance Method");
	}
	
	static void method2() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		methods obj = new methods();
		obj.method1();

		methods.method2();
	}

}

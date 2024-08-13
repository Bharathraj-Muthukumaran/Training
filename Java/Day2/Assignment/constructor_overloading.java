package Assignment;

public class constructor_overloading {

	constructor_overloading(String name){
		System.out.println("Welcome "+name);
	}
	constructor_overloading(int a,int b){
		System.out.println("Sum : "+(a+b));
	}
	constructor_overloading(int n){
		System.out.println("Sum :"+(n+n));
	}
	
	public static void main(String[] args) {
		constructor_overloading obj1 = new constructor_overloading("Bharath");
		constructor_overloading obj2 = new constructor_overloading(10,20);
		constructor_overloading obj3 = new constructor_overloading(5);

	}

}

package Day4;
class Vehicle {
    void drive() {
        System.out.println("Driving");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car");
    }
}
public class vehicle_program {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	}
}

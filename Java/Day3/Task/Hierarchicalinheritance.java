package Day3;

class Vehicle {
    void noOfEngine() {
        System.out.println("I have 1 Engine");
    }
}
class TwoWheeler extends Vehicle {
    void noOfWheels() {
        System.out.println("I have 2 Wheels");
    }
}
class Bike extends TwoWheeler {
    void brandName() {
        System.out.println("Brand Name is Honda");
    }
}

class Scooty extends TwoWheeler {
    void brandName() {
        System.out.println("Brand Name is Activa");
    }
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		Bike bike = new Bike();
        bike.noOfEngine();
        bike.noOfWheels();
        bike.brandName();

        Scooty scooty = new Scooty();
        scooty.noOfEngine();
        scooty.noOfWheels();
        scooty.brandName();
	}

}

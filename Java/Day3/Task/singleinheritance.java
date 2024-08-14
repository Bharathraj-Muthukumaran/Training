package Day3;

class twowheeler{
	void noofwheels() {
		System.out.println("I have 2 Wheels");
	}
}
class Bike extends twowheeler{
	void brandname(){
		System.out.println("Brand Name is Honda");
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noofwheels();
		bike.brandname();
	}

}

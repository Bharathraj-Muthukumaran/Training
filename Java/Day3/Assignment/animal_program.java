package Day4;

class Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
public class animal_program {

	public static void main(String[] args) {
		  Cat obj = new Cat();
	      obj.makeSound();
	}
}

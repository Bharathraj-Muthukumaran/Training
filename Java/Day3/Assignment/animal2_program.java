package Day4;

class Animal {
    void move() {
        System.out.println("Animal runs");
    }
}
class Cheetah extends Animal {
    void move() {
        System.out.println("Cheetah runs faster");
    }
}
public class animal2_program {

	public static void main(String[] args) {
		Cheetah c = new Cheetah();
        c.move();
	}

}

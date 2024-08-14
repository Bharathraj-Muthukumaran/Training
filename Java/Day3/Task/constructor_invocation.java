package Day3;

class C{
	C(){
		this(5);
		System.out.println("A");
	}
	C(int c){
		super();
		System.out.println("A 1");
	}
}
class D extends C{
	D(){
		super(5);
		System.out.println("B");
	}
	D(int c){
		System.out.println("B 1");
	}
}

public class constructor_invocation {

	public static void main(String[] args) {
		D d = new D(5);

	}

}

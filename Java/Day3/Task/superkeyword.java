package Day3;

class A
{
	int a=10;
	A (String Name)
	{
		System.out.println("Welcome "+Name);
	}
	void myMethod()
	{
		System.out.println("I am a Super class Method");
	}
}
class B extends A
{
	B()
	{
		super("Bharath");
	}
	void myMethod()
	{
		System.out.println("Super Class Variable : "+super.a);
		super.myMethod();
	}
}


public class superkeyword {

	public static void main(String[] args) {
		B b=new B();
		b.myMethod();

	}

}

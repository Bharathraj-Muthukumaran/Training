package Day2;

class Dog
{
	String Name;
	String Breed;
	
	Dog(String name,String breed)
	{
		this.Name=name;
		this.Breed=breed;
	}
	
	void setName(String name)
	{
		this.Name=name;
	}
	void setBreed(String breed)
	{
		this.Breed=breed;
	}
	void display()
	{
		System.out.println("Name : "+Name);
		System.out.println("Breed: "+Breed);
	}
}


public class Dog_program {

	public static void main(String[] args) {
		Dog obj = new Dog("Jimmy","Stray DOg");
		Dog obj1 = new Dog("Ken","bulldog");
		System.out.println("Before Set Method");
		obj.display();
		obj1.display();
		obj.setName("Ken");
		obj.setBreed("Bulldog");
		obj1.setName("Jimmy");
		obj1.setName("Stray Dog");
		System.out.println();
		System.out.println("After Set Method");
		obj.display();
		obj1.display();

	}

}

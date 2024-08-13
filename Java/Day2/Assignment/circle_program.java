package Day2;

class Circle
{
	double radius;
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	void setradius(double radius)
	{
		this.radius=radius;
	}
	
	void calculate()
	{
		double area=(22/7)*(radius*radius);
		double Circumference=2*(22/7)*radius;
		System.out.println("Area : "+area);
		System.out.println("Circumference : "+Circumference);
	}
}


public class circle_program {

	public static void main(String[] args) {
		Circle obj=new Circle(20);
		System.out.println("Before");
		obj.calculate();
		obj.setradius(2);
		System.out.println();
		System.out.println("After");
		obj.calculate();


	}

}

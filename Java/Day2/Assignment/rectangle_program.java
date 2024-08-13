package Day2;

class Rectangle
{
	double width;
	double height;
	
	Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	
	void calculatearea()
	{
		double area=width*height;
		System.out.println("Area : "+area);
	}
	void calculateperimeter()
	{
		double perimeter=2*(width+height);
		System.out.println("Perimeter : "+perimeter);
	}
	
}


public class rectangle_program {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle(10,20);
		obj.calculatearea();
		obj.calculateperimeter();

	}

}

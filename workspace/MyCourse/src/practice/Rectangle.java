package practice;

public class Rectangle 
{
	public Rectangle(int height)
	{
		int househeight = height;
		System.out.println("Height of House:" + househeight);
	}
	public Rectangle(Double height)
	{
		double buildingheight = height;
		System.out.println("Height of building: " + buildingheight);
	}
	
	
	public void aofr(int l, int b)
	{
			System.out.println("area is :" +(l*b));
	}
	public void aofr(double l, double b)
	{
		System.out.println("area :" +(l*b));
	}
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(25);
		Rectangle r1 = new Rectangle(30.5);
		r.aofr(10.5, 20.5);
		r1.aofr(10, 20);
	}
}

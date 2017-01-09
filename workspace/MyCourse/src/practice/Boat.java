package practice;

public class Boat implements Sail
{
	public void travel()
	{
		System.out.println("Boat travels in Rivers");
	}
	public void color()
	{
		System.out.println("Boat color is Blue");
	}
	public void type1()
	{
		System.out.println("Boat type is Steamer");
	}	
	public void main(String[] args)
	{
		Boat b = new Boat();
		b.travel();
		b.color();
		b.type1();
	}
}

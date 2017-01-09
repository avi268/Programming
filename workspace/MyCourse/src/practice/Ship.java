package practice;

public class Ship implements Sail 
{
	public void travel()
	{
		System.out.println("Ship travels in ocean");
	}
	public void color()
	{
		System.out.println("Ship color is Green");
	}
	public void type1()
	{
		System.out.println("Ship type is Ferry");
	}
	public static void main(String[] args)
	{
		Ship sh = new Ship();
		sh.travel();
		sh.color();
		sh.type1();
	}
}

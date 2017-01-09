package practice;

class Cordinates1
{
	public void display(int x, int y, int z)
	{
		System.out.println(x + " " + y + " " + z);
	}
}
class Cordinates2 extends Cordinates1
{
	public void display1(int x, int y, int z)
	{
		System.out.println("\n" + x + " " + y + " " + z);
	}
}

public class Cordinates3D 
{
	public static void main(String[] args)
	{
		int a=10,b=12,c=14;
		Cordinates2 c2 = new Cordinates2();
		c2.display(a, b, c);
		c2.display1(a, b, c);
	}
}

package practice;

class Plus
{
	int z;
	public void addition(int x, int y)
	{
		z = x+y;
		System.out.println("Sum is:" + z);
	}
}
class Sub extends Plus
{
	public void substraction(int x, int y)
	{
		z = x-y;
		System.out.println("Substraction is:" + z);
	}
}
public class AddSub 
{
	public static void main(String[] args)
	{
		int i=10, j=5;
		Sub a = new Sub();
		a.addition(i,j);
		a.substraction(i,j);
	}
}

package practice;

public class Staticexample 
{
	int rollno;
	String name;
	static String college = "TAMUK";
	Staticexample(int r, String n)
	{
		rollno = r;
		name = n;
	}
	void display()
	{
		System.out.println(rollno+ " " +name+ " " +college);
	}
	public static void main(String[] args)
	{
		Staticexample se = new Staticexample(123, "Avi");
		Staticexample se1 = new Staticexample(143, "Anu");
		se.display();
		se1.display();
	}
}

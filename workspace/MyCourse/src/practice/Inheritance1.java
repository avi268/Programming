package practice;

class Father
{
	private String name = "Laxman";
	public String surname = "Gunda";
	
	void show_hair()
	{
		
		System.out.print(surname+ " " +name+ " " +"has bald head");
	}
}
class Son extends Father
{
	String name = "Avi";
	String surname = "Gunda";
 void showeyesight()
	{
		System.out.println("\n" +surname+ " " +name+ " " +"is blind");
	}	
}

public class Inheritance1 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		s.show_hair();
		s.showeyesight();
	}
}

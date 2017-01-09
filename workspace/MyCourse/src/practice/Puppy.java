package practice;

public class Puppy
{
	int puppyage;
	public Puppy(String name)
	{
		String puppyname = name;
		System.out.println("Puppyname:" + puppyname);
	}
	public void setage(int age)
	{
		puppyage = age;
	}
	public void getage()
	{
		System.out.println("puppyage is :" + puppyage);
	}
	
	public static void main(String[] args)
	{
		Puppy pg = new Puppy("snoopy");
		pg.setage(5);
		pg.getage();
		
	}
}

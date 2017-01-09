package practice;

abstract class Car2
{
	public abstract void show_Color();
	public void show_Wheels()
	{
		System.out.println("No. of wheels are four");
	}
	public abstract void show_Speed();
	public abstract void show_Weight();
}
class Mercedes extends Car2
{
	public void show_Color()
	{
		System.out.println("Color of the car is Black");
	}
	public void show_Speed()
	{
		System.out.println("Max. Speed of car is 300KMPH");
	}
	public void show_Weight()
	{
		System.out.println("500kgs");
	}
}
class Alto extends Car2
{
	public void show_Color()
	{
		System.out.println("Color of car is White");
	}
	public void show_Speed()
	{
		System.out.println("Max. Speed of car is 300KMPH");
	}
	public void show_Weight()
	{
		System.out.println("Weight of car is 500Kgs");
	}
}
class Car	
{
	public static void main(String[] args)
	{
		Mercedes m = new Mercedes();
		m.show_Color();
		m.show_Wheels();
		m.show_Speed();
		m.show_Weight();
		Alto a = new Alto();
		a.show_Color();
		a.show_Wheels();
		a.show_Speed();
		a.show_Weight();
	}
}
package practice;

public class Volumes {
	public void findVol(int a, int b, int c)
	{
		System.out.println("Volume1 is :" +(a*b*c));
	}
	public void findVol(double a, int b, int c)
	{
		System.out.println("Volume1 is :" +(a*b*c));
	}
	public void findVol(float a, int b, int c)
	{
		System.out.println("Volume1 is :" +(a*b*c));
	}
	public static void main(String[] args)
	{
		Volumes v = new Volumes();
		v.findVol(2.5,3,4);
		v.findVol(3.6, 5, 1);
		v.findVol(2, 3, 4);
	}
}

package practice;

import java.util.Scanner;

public class Armstrong 
{
	
	private static Scanner s;

	public static void main(String[] args)
	{
		int a, r1, rem = 0,temp;
		System.out.println("Enter the number to check whether it is armstrong or nor:");
		s = new Scanner(System.in);
		a = s.nextInt();
		temp = a;
		while(a>0)
		{
			r1 = a % 10;
			a = a/10;
			rem = rem + (r1 * r1 * r1);
		}
		if(temp == rem)
		{
			System.out.println("the number is armstrong");
		}
		else
		{
			System.out.println(" The  number is not armstrong");
		}
	}
}

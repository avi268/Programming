package practice;

import java.util.Scanner;

public class Reverse 
{
	private static Scanner s;

	public static void main(String[] args)
	{
		int a, r1, rem=0;
		System.out.println("Enter the number to be reversed:");
		s = new Scanner(System.in);
		a = s.nextInt();
		System.out.println("Reverse number is:");
		while(a != 0)
		{
			r1 = a % 10;
			rem = (rem * 10) + r1;
			a = a/10;
		}
		System.out.println(rem);
		
	}

}

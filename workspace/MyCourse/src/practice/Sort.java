package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sort 
{
	private static Scanner s;

	public static void main(String[] args)
	{
		int i=0;
		s = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements into array:");
		for(i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("The Sorted array is:");
		for(i=0; i<=a.length-1; i++)
		{
				Arrays.sort(a);
				System.out.println(a[i]);
		}
	}
}
package practice;

//import java.util.Arrays;
import java.util.Scanner;

public class Largest 
{
	private static Scanner s;

	public static void main(String[] args)
	{
		int i=0, max;
		s = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements into array:");
		for(i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}
		max = a[0];
		System.out.println("The largest number in array is:");
		for(i=0; i<n; i++)
		{
				if(max < a[i])
				{
					max=a[i];
					System.out.println(max);
				}
		}
		
	}
}
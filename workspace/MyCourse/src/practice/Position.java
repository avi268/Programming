package practice;
import java.util.Scanner;
public class Position
{
	private static Scanner s;
	public static void main(String[] args)
	{
		int i,m;
		int res=0;
		System.out.println("enter no of values in array:");
		s = new Scanner(System.in);
		m = s.nextInt();
		int a[] = new int[m];
		System.out.println("Digits:");
		for(i=0; i<m; i++)
		{
			a[i] = s.nextInt();
			
		}
		System.out.println("Replacing values are:");
		for(i=0; i<m;)
		{
			res = i * a[i];
			System.out.println(res);
			i++;
		}
	}
}

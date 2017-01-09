package practice;
import java.util.Scanner;
public class Add 
{
	private static Scanner s;

	public static void main(String[] args)
	{
		int m,n,i,j = 0;
		System.out.println("Enter the number of rows and columns");
		s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];
		System.out.println("Enter the elements in First Matrix : ");
		for(i=0; i<m; i++)
			for(j=0; j<n; j++)
			{
				first[i][j] = s.nextInt();
			}
		System.out.println("Enter the elements in Second Matrix : ");
		for(i=0; i<m; i++)
			for(j=0; j<n; j++)
			{
				second[i][j] = s.nextInt();
			}
		System.out.println("Sum Matrix is :");
		for(i=0; i<m; i++)
			for(j=0; j<n; j++)
			{
				sum[i][j] = first[i][j] + second[i][j];
			}
		for ( i = 0 ; i < m ; i++ )
	      {
	         for ( j = 0 ; j < n ; j++ )
	            System.out.print(sum[i][j]+"\t");
	 
	         System.out.println();
	      }
	}

}

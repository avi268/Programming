package practice;
import java.util.Scanner;
public class Multi 
{
	private static Scanner s;

	public static void main(String[] args)
	{
		int m,n,p,q,k,sum=0,i = 0,j = 0;
		System.out.println("Enter the no. of rows and columns for first matrix:");
		s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		int First[][] = new int[m][n];
		System.out.println("Enter values in First matrix");
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				First[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter rows and columns for second matrix:");
		p = s.nextInt();
		q = s.nextInt();
		int second[][] = new int[p][q];
		if(n != p)
			System.out.println("Entered ordered matrix in incorrect");
		else
			System.out.println("Enter values for second matrix:");
		{
			for(i=0; i<p; i++)
			{
				for(j=0; j<q; j++)
				{
					second[i][j] = s.nextInt();
				}
			}
			
		}
		int mul[][] = new int[m][q];
		System.out.println("The resultant matrix is :");
		for(i=0; i<m; i++)
		{
			for(j=0; j<q; j++)
			{
				for(k=0; k<p; k++)
				{
					sum = sum+ First[i][k] * second[k][j];
				}
				mul[i][j] = sum;
				sum = 0;
			}
		}
		for(i=0; i<m; i++)
		{
			for(j=0; j<q; j++)
			{
				System.out.println(mul[i][j] + " ");
			}
			System.out.println();
		}
		
	}	
}

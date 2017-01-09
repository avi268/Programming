package practice;
import java.util.Scanner;
public class Week 
{
	    private static Scanner sc;

		public static void main(String[] args) 
	    {
	    	int u;
	    	System.out.println("Enter the Units of current used:");
	    	sc = new Scanner(System.in);
	    	u = sc.nextInt();
	    	if(u<= 100)
	    	{
	    		int Bill= (u*1)+50;
	    		double Total= (Bill + (Bill*0.10));
	    		System.out.println("Total Bill is:"+Total);
	    	}
	    	else if(u<=200)
	    	{
	    		int Bill= 100+((u-100)*2)+50;
	    		double Total= (Bill + (Bill*0.10));
	    		System.out.println("Total Bill is:"+Total);
	    	}	
	    	else if(u<=300)
	    	{
	    		int Bill= 100+(100*2)+((u-200)*3)+50;
	    		double Total= (Bill + (Bill*0.10));
	    		System.out.println("Total Bill is:"+Total);
	    	}
	    	else if(u<=500)
	    	{
	    		int Bill= 100+(100*2)+(100*3)+((u-300)*4)+50;
	    		double Total= (Bill + (Bill*0.10));
	    		System.out.println("Total Bill is:"+Total);
	    	}
	    	else
	    	{
	    		int Bill= 100+(100*2)+(100*3)+(200*4)+((u-500)*5)+50;
	    		double Total= (Bill + (Bill*0.10));
	    		System.out.println("Total Bill is:"+Total);
	    	}

	}

}

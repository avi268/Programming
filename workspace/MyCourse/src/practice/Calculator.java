package practice;

import java.util.Scanner;

public class Calculator 
{
	private static Scanner s;
	private static Scanner op;

	public static void main(String[] args)
	{
		int x, y;
		String opr;
		s = new Scanner(System.in);
		System.out.println("Enter first number:");
		x = s.nextInt();
		System.out.println("Enter Second number:");
		y = s.nextInt();
		System.out.println("Enter operator:");
		op = new Scanner(System.in);
		opr = op.nextLine();
		
		/*switch (opr) {
		case "+":
			System.out.println("Result is:" + add(x,y));
			break;
		case "-":
			System.out.println("Result is:" + sub(x,y));
			break;
		case "*":
			System.out.println("Result is:" + mul(x,y));
			break;
		case "/":
			System.out.println("Result is:" + divi(x,y));

		default:
			System.out.println("Illigal Operation");
			break;
		}*/
		if(opr.equals ("+"))
		{
			System.out.println("Result is:" + add(x,y));
		}
		if(opr.equals ("-"))
		{
			System.out.println("Result is:" + sub(x,y));	
		}
		if(opr.equals ("*"))
		{
			System.out.println("Result is:" + mul(x, y));
		}
		if(opr.equals ("/"))
		{
			System.out.println("Result is:" + divi(x,y));
		}
	}
public static float add(float x, float y)
{
	float result = x+y;
	return result;
}
public static float sub(float x, float y)
{
	float result = x-y;
	return result;
}
public static float mul(float x, float y)
{
	float result = x*y;
	return result;
}
public static float divi(float x, float y)
{
	float result = x/y;
	return result;
}
}

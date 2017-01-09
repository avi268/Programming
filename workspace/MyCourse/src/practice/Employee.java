package practice;

public class Employee
{
	public static void main(String[] args)
	{
		EmployeeTest e = new EmployeeTest("Avinash");
		e.details(22, "Software Developer", 100000);
		EmployeeTest e1 = new EmployeeTest("Gunda");
		e1.details(22, "Java Developer", 200000);
	}
}

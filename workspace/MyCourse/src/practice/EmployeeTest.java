package practice;

public class EmployeeTest 
{
	public EmployeeTest(String name)
	{
		String Name = name;
		System.out.println("Name is : " + Name);
	}
	public void details(int age, String Designation, int salary)
	{
		int Age = age;
		String Des = Designation;
		int Sal = salary;
		System.out.println("Age :" + Age);
		System.out.println("Designation :" + Des);
		System.out.println("Salary :" + Sal);
	}
}

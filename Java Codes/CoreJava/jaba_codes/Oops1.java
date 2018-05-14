import java.util.Scanner;

class Employee
{
	int empid;
	String name;
	int basicSal;
	double sal;

	void calc()
	{
		sal = basicSal + basicSal*0.25 - basicSal*0.1;
	}		

	Employee(int a, String b, int c)	
	{	
		empid = a;
		name = b;
		basicSal = c;
		this.calc();
	}
	
	void disp()
	{
		System.out.println("\nEmployee details");	
		System.out.println("Emp id: " + empid);	
		System.out.println("Name: " + name);	
		System.out.println("Salary: " + sal);	
	}	
	
}

public class Oops1
{
	public static void main(String[] args)
	{			
		Employee obj = new Employee(56, "Sun", 10000);
		obj.disp();
		new Employee(29, "Moon", 20000).disp();
	}
}
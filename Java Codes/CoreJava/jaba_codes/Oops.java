import java.util.Scanner;

class Employee
{
	int empid;
	String name;
	int basicSal;
	double sal;

	void init()	
	{
		System.out.println("Enter id, name, and basic salary");
		Scanner sc = new Scanner(System.in);
		empid = sc.nextInt();
		name = sc.next();
		basicSal = sc.nextInt();
	}
	
	void disp()
	{
		System.out.println("\nEmployee details");	
		System.out.println("Emp id: " + empid);	
		System.out.println("Name: " + name);	
		System.out.println("Salary: " + sal);	
	}

	void sal()
	{
		sal = basicSal + basicSal*0.25 - basicSal*0.1;
	}
	
}

public class Oops
{
	public static void main(String[] args)
	{			
		Employee obj = new Employee();
		obj.init();
		obj.sal();
		obj.disp();
		new Employee().init();
		new Employee().sal();
		new Employee().disp();
	}
}
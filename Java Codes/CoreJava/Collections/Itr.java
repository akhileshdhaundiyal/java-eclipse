//System.out.println("");
//public static void main(String args[])
import java.util.*;

class Employee
{
	int empid, sal;
	String name, desig, dept;
	
	public Employee(int a, String b, String c, String d, int e)
	{
		empid = a;
		name = b;
		desig = c;
		dept = d;
		sal = e;
	}
}

public class Itr
{
	public static void main(String args[])
	{
		List<Employee> list = new LinkedList<Employee>();
		Employee b1 = new Employee(101, "Doba", "Dev", "Tech", 200);
		Employee b2 = new Employee(102, "Tinku", "Executive", "Sales", 400);
		Employee b3 = new Employee(103, "Manaa", "Manager", "Admin", 600);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		ListIterator<Employee> it = list.listIterator();
		
		while(it.hasNext())
			System.out.println(it.next().name);
		System.out.println("");
		while(it.hasPrevious())
			System.out.println(it.previous().name);
	}
}
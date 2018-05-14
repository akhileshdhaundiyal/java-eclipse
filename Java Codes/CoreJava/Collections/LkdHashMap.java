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

public class LkdHashMap
{
	public static void main(String args[])
	{
		Map<Integer, Employee> m = new LinkedHashMap<Integer, Employee>();
		Employee b1 = new Employee(101, "Doba", "Dev", "Tech", 200);
		Employee b2 = new Employee(102, "Tinku", "Executive", "Sales", 400);
		Employee b3 = new Employee(103, "Manaa", "Manager", "Admin", 600);
		
		m.put(2,b2);
		m.put(1,b3);
		m.put(3,b1);
		m.put(1,b2);
		
		for(Map.Entry<Integer, Employee> e:m.entrySet())
		{
			int key = e.getKey();
			Employee b = e.getValue();
			System.out.println(key+" Details: ");
			System.out.println(b.empid+" "+b.name+" "+b.desig+" "+b.dept+" "+b.sal);
		}
	}
}
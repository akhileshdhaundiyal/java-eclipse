package jdbc;
import java.util.*;

public class Boxing 
{
	public static int sum(List<Integer> l)
	{
		int s=0;
		for(Integer i:l)
		{
			if(i%2!=0)
				s+=i;
			if(i.intValue()%2!=0)
				s+=i.intValue();
		}
		return s;
	}
	
	public static void main(String[] args) 
	{
		List<Integer> l = new LinkedList<Integer>();
		for(int i=0; i<10; i++)
			l.add(i);
				
		System.out.println("sum of odd: "+sum(l));
	}
}
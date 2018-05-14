package jdbc;
import java.util.*;

public class ForEachD 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(40);
		l.add(20);
		l.add(50);
		l.add(70);
		
		List<Integer> p = new LinkedList<Integer>();
		p.add(10);
		p.add(40);
		p.add(20);
		p.add(50);
		p.add(70);
		
		for(int i:l)
			for(int j:p)
				if(i<j)
					System.out.println(i+" < "+j);
	}
}
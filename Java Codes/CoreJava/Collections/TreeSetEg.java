//System.out.println("");
//public static void main(String args[])
import java.util.*;
public class TreeSetEg
{
	public static void main(String args[])
	{
		int c[] = {4,2,3,1,5};
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i=0; i<5; i++)
		{
			s.add(c[i]);
			System.out.println(s);
		}
		
		TreeSet ss = new TreeSet<Integer>(s);
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
	}
}
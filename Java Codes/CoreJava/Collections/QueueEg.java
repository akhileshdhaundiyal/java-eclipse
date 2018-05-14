//System.out.println("");
//public static void main(String args[])
import java.util.*;

public class QueueEg
{
	public static void main(String args[])
	{
		Queue<String> q = new LinkedList<String>();
		q.add("abcd");
		q.add("xyz");
		q.add("pqrs");
		q.add("lmno");
		q.offer("haha");
		
		System.out.println("head: "+q.element());
		System.out.println("head: "+q.peek());
		System.out.println();
		
		Iterator<String> it = q.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		q.remove();
		q.poll();
		System.out.println();
		
		Iterator<String> itt = q.iterator();
		while(itt.hasNext())
			System.out.println(itt.next());		
	}
}
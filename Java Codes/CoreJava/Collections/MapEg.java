//System.out.println("");
//public static void main(String args[])
import java.util.*;

public class MapEg
{
	public static void main(String args[])
	{
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(5, "penny");
		m.put(10, "balvinder");
		m.put(2, "dukhiya");
		m.put(17, "ajay");
		
		Set s = m.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println("Key: "+me.getKey()+" Value: "+me.getValue());
		}
		
		System.out.println("");
		String var = m.get(2);
		System.out.println("Value at 2: "+var);
		
		m.remove(2);
		s = m.entrySet();
		it = s.iterator();
		System.out.println("");
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println("Key: "+me.getKey()+" Value: "+me.getValue());
		}
	}
}
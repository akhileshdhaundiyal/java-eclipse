import java.util.*;
public class App
{
	public static void main(String[] args)
	{
		String str = "This is stringo , yeah ikr, its really a string";
		StringTokenizer s = new StringTokenizer(str);
		
		while(s.hasMoreElements())
				System.out.println(s.nextElement());
		
		StringTokenizer s1 = new StringTokenizer(str, ",");
		
		while(s1.hasMoreElements())
				System.out.println(s1.nextElement());
	}
}
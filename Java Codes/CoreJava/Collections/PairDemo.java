//System.out.println("");
//public static void main(String args[])
import java.util.Scanner;

class TypePair<T1, T2>
{
	private T1 first;
	private T2 second;
	
	public TypePair(T1 a, T2 b)
	{
		first = a;
		second = b;
	}
	
	public TypePair()
	{
		first = null;
		second = null;
	}
	
	public void setFirst(T1 a)
	{
		first = a;
	}
	
	public void setSecond(T2 b)
	{
		second = b;
	}
	
	public T1 getFirst()
	{
		return first;
	}
	
	public T2 getSecond()
	{
		return second;
	}
	
	public String toString()
	{
		return("First: "+first.toString()+"\nSecond: "+second.toString());
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		else if(getClass() != obj.getClass())
			return false;
		else
		{
			TypePair<T1, T2> t = (TypePair<T1, T2>) obj;
			return(first.equals(t.first) && second.equals(t.second));
		}
	}
}

public class PairDemo
{
	public static void main(String args[])
	{
		/*TypePair<String, Integer> r = new TypePair<String, Integer>("timon", 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Rating for: "+r.getFirst()+" is: "+r.getSecond());
		*/
		TypePair<Integer, Integer> r = new TypePair<Integer, Integer>(100000, 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Rating for: "+r.getFirst()+" is: "+r.getSecond());
	}
}
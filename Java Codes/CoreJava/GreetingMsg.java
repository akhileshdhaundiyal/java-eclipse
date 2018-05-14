import java.util.Scanner;

public class GreetingMsg
{
	protected GreetingMsg()
	{}

	public static void main(String[] args)
	{
		int n = 0;
		String []msg = {"Hello", "Good Morning", "Good Day"};

		while(n < 4)
		{
			try{ System.out.println(msg[n]); n++; }
			catch(ArrayIndexOutOfBoundsException e)
			{System.out.println("value reset"); n=0;}
		}
	}	
}
import java.util.Scanner;

public class OddEvenLoop
{
	public static void main(String[] args)
	{			
		System.out.println("ODD\tEVEN");
		int i=1;
		while(i<=10)
		{
			System.out.println(i + "\t" + (i+1));
			i += 2;
		}
	}
}
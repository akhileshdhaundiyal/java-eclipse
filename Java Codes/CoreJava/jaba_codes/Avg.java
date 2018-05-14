import java.util.Scanner;

public class Avg
{
	public static void main(String[] args)
	{		
		int avg=0;
		int[] a={1,5,10};
				
		for(int i=0; i<a.length; i++)
			avg += a[i];
		
		System.out.println("Average: " + ((float)avg/a.length));
	}
}
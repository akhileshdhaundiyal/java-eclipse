import java.util.Scanner;

public class SecondHigh
{
	public static void main(String[] args)
	{		
		int[] a={1,5,35,10,100,190,85,50};
		
		int t = -1;				
		for(int i=0; i<a.length; i++)
			if(a[i] > t)
				t = a[i];

		int t1 = -1;
		for(int i=0; i<a.length; i++)
			if(a[i] > t1 && a[i] != t)
				t1 = a[i];
		
		System.out.println("2nd highest: " + t1);
	}
}
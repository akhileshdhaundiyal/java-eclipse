import java.util.Scanner;

public class Pyramid
{
	public static void main(String[] args)
	{		
		System.out.println("");
				
		for(int i=5; i>=1; i--)
		{
			int x=5;
			for(int j=1; j<=i; j++)
				System.out.print(x--+" ");
			System.out.println("");			
		}

	}
}
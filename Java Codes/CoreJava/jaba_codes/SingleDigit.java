import java.util.Scanner;

public class SingleDigit
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();

		if(a/10==0)
			System.out.println("Single digit");
		else
			System.out.println("Multiple digits");
				
	}
}
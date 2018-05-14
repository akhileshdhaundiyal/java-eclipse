import java.util.Scanner;

public class Greater3
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a>b && a>c)
			System.out.println("First");
		else if(b>c && b>a)
			System.out.println("Second");
		else
			System.out.println("Third");
				
	}
}
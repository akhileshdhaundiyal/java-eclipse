import java.util.Scanner;

public class Greater2
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Greater number: " + (a>b?a:b));				
	}
}
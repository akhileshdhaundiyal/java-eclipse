import java.util.Scanner;

public class Calc
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter an operation: ");
		char x = sc.next().charAt(0);

		switch(x)
		{
			case '+':
				System.out.println("Anser: " + (a+b));
				break;
			case '-':
				System.out.println("Anser: " + (a-b));
				break;
			case '*':
				System.out.println("Anser: " + (a*b));
				break;
			case '/':
				System.out.println("Anser: " + ((float)a/b));
				break;
			default:
				System.out.println("Invalid operation");
		}
	}
}
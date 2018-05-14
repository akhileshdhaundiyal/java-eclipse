import java.util.Scanner;

public class SeriesSum
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int x=0;
		for(int i=1; i<=n; i++)
			x += i;
		System.out.println("Answer: "+x);
	}
}
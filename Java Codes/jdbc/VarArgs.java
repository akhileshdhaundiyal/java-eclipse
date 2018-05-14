package jdbc;

public class VarArgs 
{
	static void fun(String str, int ...a)
	{
		System.out.println("String: "+ str);
		System.out.println("No. of args: "+ a.length);
		
		for(int i:a)
			System.out.println(i+" ");
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		fun("lol", 1, 2);
		fun("lolo", 1, 2, 3);
		fun("lololo");
	}
}
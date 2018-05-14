public class GenericMethod
{
	static <T> void disp(T t)
	{
		System.out.println(t);
	}
	
	public static void main(String args[])
	{
		disp(100);
		disp(99.99);
		disp("yoyo");
	}
}
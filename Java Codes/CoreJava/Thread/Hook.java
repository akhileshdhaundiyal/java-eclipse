//System.out.println("");
//public static void main(String args[])
class MyThread extends Thread
{
	public void run()
	{System.out.println("shutdown hook");}	
}

public class Hook
{
	public static void main(String args[]) throws Exception
	{
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		
		System.out.println("Main sleeping, Ctrl + C");
		try{Thread.sleep(3000);}
		catch(Exception e){}
	}
}
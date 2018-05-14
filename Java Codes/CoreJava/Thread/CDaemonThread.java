public class CDaemonThread extends Thread
{
	public static void main(String args[])
	{
		System.out.println("Main Entry");
		CDaemonThread t = new CDaemonThread();
		t.setDaemon(true);
		t.start();
		
		try
		{
			Thread.sleep(3000);			
		}
		catch(InterruptedException x){}
		
		System.out.println("Main Exit");
	}

	public void run()
	{
		System.out.println("Run Method Entry");
		
		try
		{
			System.out.println("Run's current thread: " + Thread.currentThread());
			
			while(true)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException x) {}
				
				System.out.println("Run's method: "+Thread.currentThread());
			}
		}

		finally
		{
			System.out.println("Run Method Exit");
		}
	}
}
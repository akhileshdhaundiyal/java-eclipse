class Count implements Runnable
{
	Thread mthread;
	
	Count()
	{
		mthread = new Thread(this, "runnable thread");
		System.out.println("Thread created:" + this);
		mthread.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=1; i<=20; i++)
			{
				System.out.println("Count: " + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{System.out.println("Thread Interrupted !");}
		
		System.out.println("Thread exec finish");
	}
}

class RunnableEg
{
	public static void main(String args[])
	{
		Count c = new Count();
		try
		{
			while(c.mthread.isAlive())
			{
				System.out.println("Main thread shall live till Child is alive");
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{System.out.println("Thread Interrupted !");}
		
		System.out.println("Main Thread finish");
	}
}
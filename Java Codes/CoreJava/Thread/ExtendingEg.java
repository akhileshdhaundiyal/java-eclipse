class Count extends Thread
{
	Count()
	{
		super();
		System.out.println("Thread created:" + this);
		start();
	}
	
	public void run()
	{
		try
		{
			for(int i=0; i<=20; i++)
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

class ExtendingEg
{
	public static void main(String args[])
	{
		Count c = new Count();
		try
		{
			while(c.isAlive())
			{
				System.out.println("Main thread shall live till Child is alive");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{System.out.println("Thread Interrupted !");}
		
		System.out.println("Main Thread finish");
	}
}
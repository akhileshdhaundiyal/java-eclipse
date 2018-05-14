class X extends Thread
{
	public void run()
	{
		System.out.println("Thread X started");
		for(int i=0; i<5; i++)
			System.out.println("i in X: "+i);
		System.out.println("Thread X finished");
	}
}

class Y extends Thread
{
	public void run()
	{
		System.out.println("Thread Y started");
		for(int i=0; i<5; i++)
			System.out.println("i in Y: "+i);
		System.out.println("Thread Y finished");
	}
}

class Z extends Thread
{
	public void run()
	{
		System.out.println("Thread Z started");
		for(int i=0; i<5; i++)
			System.out.println("i in Z: "+i);
		System.out.println("Thread Z finished");
	}
}

class ThreadPriority
{
	public static void main(String args[])
	{
		System.out.println("Main Thread started");
		X threadX = new X();
		Y threadY = new Y();
		Z threadZ = new Z();
		
		threadZ.setPriority(Thread.MAX_PRIORITY);
		threadY.setPriority(threadX.getPriority()+1);
		threadX.setPriority(Thread.MIN_PRIORITY);
		threadX.start();
		threadY.start();
		threadZ.start();
		
		try
		{
			threadX.join();
			threadY.join();
			threadZ.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread finished");
		}
	}
}
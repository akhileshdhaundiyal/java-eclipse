class ThreadSync
{
	public static void main(String args[])
	{
		MyThread t1 = new MyThread("thread1: ");
		MyThread t2 = new MyThread("thread2: ");
		
		t1.start();
		t2.start();
		
		boolean t1Alive = true;
		boolean t2Alive = true;
		
		do
		{
			if(t1Alive && !t1.isAlive())
			{
				t1Alive = false;
				System.out.println("Thread 1 is Alive");
			}
			if(t2Alive && !t2.isAlive())
			{
				t2Alive = false;
				System.out.println("Thread 2 is Alive");
			}
		}while(t1Alive || t2Alive);
	}
}

class MyThread extends Thread
{
	static String msg[] = {"haha", "hehe", "hoho", "huhu", "heha"};
	
	public MyThread(String id)
	{super(id);}
	
	public void run()
	{SynchronizedOutput.displayList(getName(), msg);}
	
	void randomWait()
	{
		try
		{
			sleep((long)(3000*Math.random()));			
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrrupted");
		}
	}
}

class SynchronizedOutput
{
	public static synchronized void displayList(String name, String list[])
	{
		for(int i=0; i<list.length; ++i)
		{
			MyThread tt = (MyThread) Thread.currentThread();
			tt.randomWait();
			System.out.println(name+list[i]);
		}
	}
}
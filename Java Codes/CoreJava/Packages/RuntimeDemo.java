class RuntimeDemo
{
	protected RuntimeDemo()
	{}

	public static void main(final String[] args)
	{
		Runtime objR = Runtime.getRuntime();
		Process objP = null;	
		try
		{objP = objR.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");} 
		catch(Exception e)
		{System.out.println("Error");}

		System.out.println(objR.freeMemory());
		System.out.println(objR.totalMemory());
System.gc();
		System.out.println(objR.freeMemory());
		System.out.println(objR.totalMemory());
	}
}
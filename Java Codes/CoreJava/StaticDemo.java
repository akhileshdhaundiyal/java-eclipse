class StaticDemo
{
	static int count;

	StaticDemo()
	{count+=1;}
	
	static void disp()
	{
	        System.out.println("Objects created: "+count);
	}

	public static void main(String[] args) 
	{
        	StaticDemo s1 = new StaticDemo();
        	StaticDemo s2 = new StaticDemo();
		s2.disp();
        	StaticDemo s3 = new StaticDemo();
        	StaticDemo s4 = new StaticDemo();
		s2.disp();
    	}
}

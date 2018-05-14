import java.util.Scanner;

class Doctor
{
	protected int id;
	protected String name;
	protected String address;

	Doctor() {}

	Doctor(final String s, final int n, final String a)
	{
		name = s;
		id = n;
		address = a;
	}
	
	void disp()
	{
		System.out.println("Id: " + id);	
		System.out.println("Address: " + address);	
		System.out.println("Name: " + name);	

	}	
}

class Specialist extends Doctor
{
	protected String spec;

	Specialist() {};

	Specialist(final String s, final int n, final String a, final String sp)
	{
		super(s, n, a);
		spec = sp;
	}

	void disp()
	{	
		super.disp();
		System.out.println("Speciality: " + spec);			
	}
}

class NonSpecialist extends Doctor
{
	NonSpecialist() {};

	NonSpecialist(final String s, final int n, final String a)
	{
		super(s, n, a);		
	}
}

class TestDoctor
{
	public TestDoctor() {}

	public static void main(String[] args)
	{			
		Specialist spo = new Specialist("Marrry", 1234, "NYC", "Medi");	
		spo.disp();
		NonSpecialist nspo = new NonSpecialist("Harrry", 1235, "Texas");	
		nspo.disp();

	}	
}
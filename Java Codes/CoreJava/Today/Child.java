class Parent{}

public class Child extends Parent
{
	public void check()
	{System.out.println("casted");}
	
	public static void show(Parent p)
	{
		if(p instanceof Child)
		{Child b1 = (Child)p; b1.check();}
	}

	public static void main(String[] args)
	{
		Parent p = new Child();
		Child.show(p);
	}
}

import java.util.Scanner;

class Complex
{	
	double real, img;

	Complex(double a, double b)
	{
		real = a;
		img = b;
	}
	
	void disp()
	{
		System.out.println(real + " + i" + img);
	}

	void add(Complex obj)
	{
		real += obj.real;
		img += obj.img;
	}
	
}

public class ComplexAdd
{
	public static void main(String[] args)
	{			
		Complex obj1 = new Complex(10.3, 67.4);
		Complex obj2 = new Complex(0.7, 3.6);
		
		obj1.add(obj2);
		System.out.println("Addition of Complex Number: ");
		obj1.disp();
	}
}
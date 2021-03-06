import java.io.*;

class Student implements Serializable
{
	int id;
	String name;
	transient int age;
	
	public Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

class Persist 
{
	public static void main(String[] args) throws Exception
	{
		Student s = new Student(100, "Rohn", 25);
		FileOutputStream fo = new FileOutputStream("fa.txt")	;
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		oo.writeObject(s);
		oo.flush();
		System.out.println("done");
	}
}
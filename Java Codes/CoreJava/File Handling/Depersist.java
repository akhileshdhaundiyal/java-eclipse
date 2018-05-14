import java.io.*;

class Depersist 
{
	public static void main(String[] args) throws Exception
	{
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("f.txt"));
		
		Student s = (Student)oi.readObject();
		System.out.println(s.name+" "+s.age);
		oi.close();
	}
}
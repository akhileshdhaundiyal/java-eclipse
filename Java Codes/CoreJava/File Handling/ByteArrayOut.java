import java.util.*;
import java.io.*;
public class ByteArrayOut
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream f1 = new FileOutputStream("file1.txt");
		FileOutputStream f2 = new FileOutputStream("file2.txt");
		ByteArrayOutputStream b = new ByteArrayOutputStream();

		String s = "very very nice";
		byte[] t = s.getBytes();
		
		b.write(t);
		b.writeTo(f1);
		b.writeTo(f2);		
		
		f1.close();
		f2.close();
		b.close();
		
		System.out.println("good");
	}
}
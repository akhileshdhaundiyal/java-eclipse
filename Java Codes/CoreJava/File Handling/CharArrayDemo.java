import java.util.*;
import java.io.*;

public class CharArrayDemo
{
	public static void main(String args[]) throws IOException
	{
		CharArrayWriter c = new CharArrayWriter();
		
		FileWriter f1 = new FileWriter("file1.txt");
		FileWriter f2 = new FileWriter("file2.txt");
		FileWriter f3 = new FileWriter("file3.txt");
		
		c.write("sup");
		c.writeTo(f1);
		c.writeTo(f2);
		c.writeTo(f3);
		
		f1.close();
		f2.close();
		f3.close();
	}
}
package jdbc;
import java.io.*;

public class TryRes 
{
	public static void main(String[] args) 
	{
		try(BufferedReader br = new BufferedReader(new FileReader("d:\\a.txt")))
		{
			String str;
			while((str=br.readLine())!=null)
				System.out.println(str);
		}
		catch(Exception e)
			{System.out.println(e);}
	}
}
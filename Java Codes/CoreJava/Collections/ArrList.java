//System.out.println("");
//public static void main(String args[])
import java.util.ArrayList;
import java.util.List;
class ArrList
{	
	ArrayList a;	
	List b;
	
	ArrList()
	{
		a = new ArrayList();
		//b = new List();
	}

	void add()
	{
		for(int i=0; i<5; i++)
			a.add(new Integer(i));
		
		a.add("hmm");
		a.add("nice");
		a.add("hmm");
		System.out.println("");
	}
	
	void search()
	{
		System.out.println("1st occurence of hmm: "+a.indexOf("hmm"));
		System.out.println("2st occurence of hmm: "+a.lastIndexOf("hmm"));
	}
	
	void extract()
	{
		b = a.subList(5, a.size());
		System.out.println("Sub-list: "+b);
	}
	
	void disp()
	{
		for(int i=0; i<a.size(); i++)
			System.out.println(a.get(i));
	}
	
	public static void main(String args[])
	{
		ArrList obj = new ArrList();
		obj.add();
		obj.disp();
		System.out.println("");
		obj.search();
		System.out.println("");
		obj.extract();
	}
}
package jdbc;

import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import static java.util.Collections.*;

public class StaticDemo1 {

	public static void main(String[] args) {
		double var1 = sqrt(5.0);
		double var2 = tan(30);
		out.println("Square of 5 is : " + var1);
		out.println("Tan of 30 is : " + var2);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(56);
		a.add(5);
		sort(a);
		System.out.println(a);
	}

}

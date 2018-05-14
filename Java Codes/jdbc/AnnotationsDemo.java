package jdbc;

class Base {
	public void display() {
		System.out.println("Base display()");
	}
}
class Derived extends Base {
	@Deprecated
	public void display(int x) {
		System.out.println("Derived display() : " + x);
	}

	@Override
	public void display() {
		System.out.println("Derived display()");
	}
}

public class AnnotationsDemo {

	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.display();
		obj.display(2);
	}
}
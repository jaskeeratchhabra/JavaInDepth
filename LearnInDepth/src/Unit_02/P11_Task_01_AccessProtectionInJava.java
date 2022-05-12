package Unit_02;

public class P11_Task_01_AccessProtectionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.showData();
		obj.accessData();

	}

}
class ParentClass {
	
	int a = 20;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	void showData() {
		System.out.println("Inside Parent Class");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
	}
}

class ChildClass extends ParentClass{
	void accessData() {
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
//		System.out.println("d = " + d);             //      Private Members cannot be accessed.
	}
}

class AnotherClass{
	void display() {
		
		ParentClass obj = new ParentClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
	}
}

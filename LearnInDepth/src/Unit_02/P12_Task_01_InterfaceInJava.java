package Unit_02;
interface Animal{
	public void animalsound();             // Interface method does not have a body.
	public void run();
}

interface Human{
	
	public void humansound();
	public void run1();
	
}
public class P12_Task_01_InterfaceInJava {
	// Interface - 100% abstract class.
//	interface Animal{
//		public void animalsound();             // Interface method does not have a body.
//		public void run();
//	}
//
//	interface Human{
//		
//		public void humansound();
//		public void run1();
//		
	
	
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
		Species obj2=new Species();
		obj2.animalsound();
		obj2.run();
		obj2.humansound();
		obj2.run1();
		

	}
}
//public void animalsound() {}
	
//public void run() {}


//	public void animalsound();             // Interface method does not have a body.
//	public void run();


//public void animalsound();             // Interface method does not have a body.
//public void run();
	
class Species implements Animal, Human{
	
	public void animalsound() {
		
		System.out.println("We are inside animalsound");
		
	}
	
	public void run() {
		
		System.out.println("We are inside run method");
		
	}
	
	public void humansound() {
		
		System.out.println("We are inside humansound");
		
	}
	
	public void run1() {
		
		System.out.println("We are inside run method");
	
	}
	
}
interface A2{
	void fun2();
}

interface A1 {
	
	void funcA();
	
}

interface B1 extends A1,A2 {
	
	void funcB();
	
}

class C1 implements B1{
	
	public void funcA() {
		
		System.out.println("This is funcA from A1");
	
	}
	
	public void funcB() {
		
		System.out.println("This is funcB from A2");
		
	}
	public void fun2() {
		System.out.println("hey");
	}
	
}

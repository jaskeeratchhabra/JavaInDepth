package unit_01;

public class P5_Task_02_MethodsInJava {

	public static void main(String[] args) {
        ABC3 obj = new ABC3();
		ABC3.display();
		System.out.println(ABC3.a);
		obj.display2();
	}
}
class ABC3 {
	static int a = 10;
	
	static void display() {
		int b = 10;
		int a = 10;
		System.out.println("Calling b from Static display...");
		System.out.println(b);
		System.out.println("Calling a from static display...");
		System.out.println(a);
	}
	
	int display2() {
		System.out.println("Calling a from display2...");
		System.out.println(a);
		return a;
	}
	
}
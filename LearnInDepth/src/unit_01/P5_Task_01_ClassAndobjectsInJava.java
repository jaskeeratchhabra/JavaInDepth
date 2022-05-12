package unit_01;

public class P5_Task_01_ClassAndobjectsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC2 obj = new ABC2();
		obj.display2();
		
		ABC2.display();

	}
}
class ABC2 {
	
	int a = 10;
	static int b = 10;
	
	static void display() {
		int b = 10;
		b++;
		System.out.println("Calling 'b' inside STATIC display function from class ABC...");
		System.out.println(b);
	}
	
	void display2() {
		System.out.println("Calling 'a' inside display2 function from class ABC...");
		System.out.println(a);
	}
}


package unit_01;

public class P5_Task_03_Constructor_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC4 obj = new ABC4();
		System.out.println(obj.a);
		

	}

}

class ABC4 {

	int a;
	
	
	/*
	 ClassName(Constructor Parameters){
	 	All the class and Instance variables can be initialized here!
	 }
	 */
	
	ABC4(){
		a = 10;
	}
	
	
	ABC4(int a ){
		this.a = a;
	}
	
	
	void display() {
		
		int b = 10;

		System.out.println(a);
		System.out.println(b);

	}
	
	int display2() {
		
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		//System.out.println(b);
		
		return a;

	}
}

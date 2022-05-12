package unit_01;

public class P3_Task_02_OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatorsInJava obj = new OperatorsInJava();
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperators();
		obj.TernaryOperator();
		obj.AssignmentOperator();
	}
}
class OperatorsInJava{
	void UnaryOperator() {
		int a = 10;
		boolean b = false;
		System.out.println("Inside Unary Operator");
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(~a);
		System.out.println(!b);
		System.out.println();
	}
	
	void ArithmeticOperator() {
		System.out.println("Inside Arithmetic operator");
		int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(((10*10)/5) + 3 - ((1*4)/2));
		System.out.println();
	}
	
	void ShiftOperator() {
		System.out.println("Inside Shift Operator");
		System.out.println(10 << 2);                  // 10 * 2^2 = 10*4 = 40
		System.out.println(10 << 3);                  // 10 * 3^3 = 10*9 = 80
		System.out.println(20 << 2);                  // 20 * 2^2 = 20*4 = 80
		System.out.println(15 << 4);                  // 15 * 4^4 = 15*16 = 240
		
		System.out.println(10 >> 2);                  // 10 / 2^2 = 10/4 = 2
		System.out.println(20 >> 2);                  // 20 / 2^2 = 20/4 = 5
		
		System.out.println();
	}
	
	void RelationalOperator() {
		System.out.println("Inside Realtional Operator");
		
		int a = 10;
		int b = 20;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println();
	}
	
	void BitwiseAndLogicalOperators() {
		System.out.println("Inside Bitwise and logical Operator");
		int a = 10;
		int b = 5;
		int c = 20;
		
		System.out.println(a<b || a++<c);
		System.out.println(a);
		
		System.out.println(a<b || a++<c);
		System.out.println(a);
		
		System.out.println();
	}
	
	void TernaryOperator() {
		System.out.println("Inside Ternary Operator");
		int a = 2;
		int b = 5;
		int min = (a<b)? a:b;
		System.out.println(min);
		
		System.out.println();
	}
	
	void AssignmentOperator() {
		System.out.println("Inside Assignment Operator");
		int a = 10;
		int b = 20;
		
		a+=4;
		b+=12;
		System.out.println(a);
		System.out.println(b);
		b>>>=4;
		System.out.println(b);
		
		a = 10;
		a+=3;
		System.out.println(a);
		a-=4;
		System.out.println(a);
		a*=2;
		System.out.println(a);
		a/=2;
		System.out.println(a);
		
		System.out.println();
	}
}

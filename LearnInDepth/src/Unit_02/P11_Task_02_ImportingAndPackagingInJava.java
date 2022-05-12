package Unit_02;
import unit_01.P3_Task_01_VariablesAndDatatypesInJava;
import static java.lang.System.*;
import static java.lang.Math.*;

import unit_01.P3_Task_01_VariablesAndDatatypesInJava;

public class P11_Task_02_ImportingAndPackagingInJava {
	public static void main(String[] args) {
		
		out.println("Welcome to package");
		
		
		out.println(sqrt(4));               // Use of "out"
		System.out.println(pow(2, 2));
		System.out.println(abs(6.3));
		
		P3_Task_01_VariablesAndDatatypesInJava obj = new P3_Task_01_VariablesAndDatatypesInJava();
		
		B11 b=new B11();
	
	}
}
class B11 extends P11_Task_02_ImportingAndPackagingInJava{
	
	void fun()
	{
		System.out.println("jhdfjhj");
	}
	
}
package unit_03;

import java.util.Scanner;
import java.util.*;
public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sensitive code
		
		try
		{
		int b=0;
		int a=100/b;
		System.out.println(a);
		//System.out.println("Done!");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//rest of the code
		System.out.println("Done!");
		ABCDE obj =new ABCDE();
		obj.inputMismatchException();
		obj.mauallyThrowAnExceptionFromYourCode(3);

	}
}
class ABCDE{
	    
	void inputMismatchException() {
		Scanner sr=new Scanner(System.in);
		try
		{
			int a=sr.nextInt();
			System.out.println(a);
			sr.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Input Mismatch Issue!");
		}
		sr.close();
		System.out.println("Done!");
	}
	//use of throw
	void mauallyThrowAnExceptionFromYourCode(int age)
	{
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("AccessDEnied-You must be an 18");
			}
			else
			{
				System.out.println("Access grated you are old enough");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
	/*void stackOverflowError{
		try {
			while(a>0)
			{
				a++;
				stackOverflowError(a);
				
			}
		}
		catch
		{
			
		}
	}
}
*/
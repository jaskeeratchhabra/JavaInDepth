package unit_03;
import java.util.InputMismatchException;
import java.util.Scanner;
class exception{
    void basicException() {
        int b=0;
        int a=10/b;
        System.out.println(a);
        System.out.println("Done!");
    }
    void handelException() {
        try {
            int b=0;
            int a=10/b;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Done!");
        }
    }
    void multipleCatch() {

        try {
            int b=0;
            int a=10/b;
            System.out.println(a);
        }//child class exception came first
        catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " Arithmeetic!!!!");
            System.out.println("Done!");
        }catch(Exception e) {
            System.out.println(e.getMessage() + " exception!!");
        }
    }
     void inputMismatchException() throws Exception {
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
    void stackOverFlowError(int i) {
        try {
            while(i>0) {
                i++;
                stackOverFlowError(i);
            }
            //this is error cant resolved because it is not a ecption
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Other code execute!!");

    }

    void indexOutofBoundException() {
        try {
            int[] num= {1,2,3,4};
            System.out.println(num[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Done!!");
    }
    void nullPointerException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    void useofThrow(int age) throws Exception{
        if(age<18){
            throw new Exception();
        }
        else{
            System.out.println("You are allowed to enter");
        }
    }
    void useofThrow_And_Finally() {
        try{
            useofThrow(17);
        }catch (Exception e){
            //TODO Auto generated catch blocl
            e.printStackTrace();
        }
        finally{
            System.out.println("The 'try catch' block is finished");
        }
    }
    void checkedAndUncheckedException() {

		/*
		 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		 * will not be caught at compile time - as there is no mistake but caught at
		 * runtime - because it is mathematically incorrect
		 */
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		// Checked Exception [Run this code over terminal and check compiler error]
		try {
			useOfThrow(19);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void manualExceptionThrow() {

		try {

			// Have to use try and Catch here!
			calculateArea(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	void calculateArea(int r) throws ManualException {

		if (r < 0) {
			throw new ManualException();
		}

		int area = r * r;
		System.out.println(area);

	}


@SuppressWarnings("serial")
class ManualException extends Exception {

	@Override
	public String getMessage() {
		String detailMessage = "Exception Occured!";
		return detailMessage;
	}

}
}


public class P14_ExceptionHandllingInJava {


    public static void main(String args[]) {
        exception obj=new exception();
        obj.basicException();
        obj.handelException();
        obj.multipleCatch();
       //obj.inputMismatchException();
        obj.stackOverFlowError(2);
        obj.indexOutofBoundException();
        obj.nullPointerException();
       // obj.useofThrow(12);
        obj.useofThrow_And_Finally();
    }
}

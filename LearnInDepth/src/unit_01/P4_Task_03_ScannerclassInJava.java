package unit_01;
import java.util.Scanner;
public class P4_Task_03_ScannerclassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj1 = new Scanner(System.in);
		Scanner myobj2 = new Scanner(System.in);
		
		System.out.println("Enter first name : ");
		String nm1 = myobj1.next();
		System.out.println("First Name is " + nm1 + "\n");
		
		System.out.println("Enter Second name : ");
		String nm2 = myobj2.nextLine();
		System.out.println("Second Name is" + nm2 + "\n");
		
		System.out.println("Enter Boolean Value : ");
		boolean b = myobj2.nextBoolean();
		System.out.println("Entered boolean is " + b + "\n");
		
		myobj1.close();
		myobj2.close();

	}

}

package unit_01;
import java.util.Scanner;
/* Problem Statement: P7_SwitchStatements: 
Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
* */
public class P7_Task_01_SwitchStatementsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();
	}
}
class SwitchStatements {
	void switchStatements() {
		System.out.println("Enter the value of d : ");
		Scanner a = new Scanner(System.in);
	    int d = a.nextInt();
	    
		switch(d) {
		
		case 1:
		System.out.println("current year");
		break;
		
		case 2:
		System.out.println("current month");
		break;
		
		case 3:
		System.out.println("current day");
		break;
		
		case 4:
		System.out.println("not applicable");
		break;
		
		default:
		System.out.println("You entered the default value : ");
		System.out.println(d);
		}
	}
}

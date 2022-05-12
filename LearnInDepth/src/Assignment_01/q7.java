package Assignment_01;

import java.util.Scanner;

class Employee
{
    static int count = 0;
    void display()
    {
        count++;
    }
    int result()
    {
        return count;
    }

}
public class q7 {

	 public static void main (String [] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        //System.out.print("Enter how many objects u want to create : ");
	        //int n = sc.nextInt();
	        Employee obj1 = new Employee();
	        Employee obj2 = new Employee();
	        Employee obj3 = new Employee();
	        Employee obj4 = new Employee();
	        obj1.display();
	        obj2.display();
	        obj3.display();
	        obj4.display();
	        System.out.print("No of times display function called is : " + obj4.result());
	        
	    }
}

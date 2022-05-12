package Assignment_01;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	     Students arr[]=new Students[6];
	     for(int i=0;i<3;i++)
	     {   System.out.println("enter name " +(i+1));
	   	    	 String s=obj.next();
	   	     System.out.println("enter age");
	    	 int a1=obj.nextInt();
	    	 System.out.println("enter section");
	    	 char sec=obj.next().charAt(0);
	    	 System.out.println("enter percentage");
	    	 float f=obj.nextFloat();
	    	 arr[i] = new Students(s,a1,sec,f); 
	     }
	     float avg=(arr[0].percentage+arr[1].percentage+arr[2].percentage)/3;
	     System.out.println("avg percentage is " + avg);
	     obj.close();

	}
}
class Students
{
	String name;
	int age;
	char section;
	float percentage;
	Students(String s,int a,char sec,float p)
	{
		name=s;
		age=a;
		section=sec;
		percentage=p;
	}	
}

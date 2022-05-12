
package Assignment_01;
import java.util.Scanner;
interface In1{
    void display(int p);
}
public class q3
{
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	testClass o=new testClass();
	o.display(9);
  }
}

 class testClass implements In1{
     public void display(int p){
         if(p==2 || p==3)
         {
             System.out.println("The given number is prime");
         }
         if(p==1)
         System.out.println("The given number is not prime");
         if(p>2){
         if(p%2==0 || p%3==0)
         {
             System.out.println("The given number is not prime");
         }}
         for(int i=5;i*i<p;i=i+6)
         {
             if(p%i==0 || p%(i+2)==0)
             {
             System.out.println("The given number is not prime");
         
             }
             System.out.println("The given number is prime");
         }
     }
 }

package Assignment_01;
public class q2
{
	public static void main(String[] args) {
		
        ABC obj1=new ABC();
        ABC obj2=new ABC();
        ABC obj3=new ABC();
        ABC obj4=new ABC();
        ABC.display();
	}
}
class ABC
{
    static int count=0;
    ABC()
    {
        count++;
    }
    static void  display()
    {
        System.out.println(count);
    }
}

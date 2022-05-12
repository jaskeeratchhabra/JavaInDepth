package Assignment_01;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=10;
		calculate obj=new calculate();
		int x=a>b?obj.sum(a,b):obj.sub(a,b);
	    System.out.println(x);
	}
	

}
class calculate
{
	int  sum(int a1,int b1)
	{
		return a1+b1;
	}
	int sub(int a2,int b2)
	{   
		int y=(a2<b2)?0:a2-b2;
		return y;
	}
}

package unit_01;

public class P3_Task_01_VariablesAndDatatypesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int     a = 10;
	    float   b = 22.56f;
	    char    c = 'D';
		double  d = 34.67854d;
	    boolean e = true;
		
		//This way these local variables can be printed.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//As static variables do not require to be called through an instance of class. SO , it can be accessed(preferably) by:>
		System.out.println( Wow.ch );
	}
}

class Wow{
	public static char ch = 'A';
	public int a=3;
	protected int b=4;
	private int c=5;

	}

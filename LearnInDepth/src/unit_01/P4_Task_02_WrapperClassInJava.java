package unit_01;

public class P4_Task_02_WrapperClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		String s = "" + a + "";
		
		Integer i = Integer.valueOf(a);
		Integer j = a;
		
		System.out.println(a + " " + i + " " + j);
		System.out.println(i.toString());
		
		byte b=10;
		Byte byteobj = b;
		
		System.out.println(byteobj);
		
		byte bytevalue = byteobj;
		System.out.println(bytevalue);
		System.out.println(s);

	}
}

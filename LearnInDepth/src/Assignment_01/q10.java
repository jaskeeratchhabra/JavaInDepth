package Assignment_01;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car delhi=new car(1,2,3,4);
		car mumbai=new car(4,5,6,7);
		car chennai=new car(2,3,4,5);
		car kolkata=new car(1,5,6,7);
		int m1=delhi.mk+mumbai.mk+chennai.mk+kolkata.mk;
		int z1=delhi.za+mumbai.za+chennai.za+kolkata.za;
		int w1=delhi.w+mumbai.w+chennai.w+kolkata.w;
		int m2=delhi.ms+mumbai.ms+chennai.ms+kolkata.ms;
		System.out.println("mk10 "+m1);
		System.out.println("zen "+z1);
		System.out.println("wagonR "+w1);
		System.out.println("msx4 "+m2);
	}
}
	class car{
		int mk,za,w,ms;
		car(int m1,int z,int w1,int m2)
		{
			mk=m1;
			za=z;
			w=w1;
			ms=m2;
		}
	}


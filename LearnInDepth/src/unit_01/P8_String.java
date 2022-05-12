package unit_01;
/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */


public class P8_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("9763421");
		String s2 = new String("7545a");		
		
		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}
class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write your Logic Here!
		int a  = 0;
		int b = s.length();
//		int c = b-1;
		char arr[] = new char[b];
		for(int i=b-1; i>=0; i--) {
			arr[a] = s.charAt(i);
			a++;
			
		}
		
		for(int i=0; i<b; i++) {
			if(arr[i] != s.charAt(i)) {
				System.out.println("Not a palindrome number.");
				break;
			}
			
			if(i == b-1) {
				System.out.println("Palindrome Number");
				break;
			}
			
		}
		
//		System.out.println("done");
		
	}

	void reverseOfAString(String s) {
		// Write Logic Here!
		int x = s.length();
		char[] arr = new char[x];

		System.out.println("Array before reversing is : ");
		for(int i=0; i<x; i++){
			System.out.println(s.charAt(i));
		}
				
		for(int i=0; i<x; i++) {
			arr[i] = s.charAt(x-1-i);
		}
		
		System.out.println("Array after reversing is : ");
		for(int i=0; i<x; i++){
			System.out.println(arr[i]);
		}
		
	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		int x = s1.length();
		int y = s2.length();
		if(x==y) {
			for(int i=0; i<x; i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					System.out.println("Unequal String...");
					break;
				}
				
				if(i-1 == x) {
					System.out.println("Strings are equal...");
				}
			}
		}
		
		else {
			System.out.println("Unequal Strings...");
		}
	}
}

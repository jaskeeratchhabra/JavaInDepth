package unit_01;

public class P9_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}
class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		 for(int i = 0; i < arr.length; i++){
		        int min_ind = i;
		        
		        for(int j = i + 1; j < arr.length; j++){
		            if(arr[j] < arr[min_ind]){
		                min_ind = j;
		            }
		        }
		        
		       int temp = arr[i];
		       arr[i] = arr[min_ind];
		       arr[min_ind]=temp;
		    }
		 
		 for(int i =0 ;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}

	void findTheDuplicateElements(int[] arr) {
		System.out.println("\n");
		for(int i=1 ; i<arr.length; i++)
		{
			if(arr[i]==arr[i-1])
			{
				System.out.println(arr[i]);
			}
		}

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		int l = arr[0], sl = arr[1];
		int s = arr[0], ss = arr[1];
		for(int i = 1; i < arr.length; i++)
		{
			if(l < arr[i])
			{
				sl = l;
				l = arr[i];
			}
			if(s > arr[i])
				{
				   ss = s;
				   s = arr[i];
				}	  
		}
		
		System.out.println("\nSECOND LARGEST : "+sl);
		System.out.println("SECOND SMALLEST : "+ss);
	}

	void leftRotationInAnArray(int[] arr) {
		int temp = arr[0];
		for(int i = 1; i<arr.length;i++)
			arr[i-1] = arr[i];
		 arr[arr.length-1] = temp;
		 System.out.println("LEFT ROTATED ARRAY : ");
		 for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	void removeElementInArray(int[] arr) {
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		int n=arr.length;
		n--;
	}

}
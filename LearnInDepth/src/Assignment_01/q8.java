package Assignment_01;
import java.util.Scanner;
public class q8 {

	public static void main(String [] args)
    {
        System.out.println("Name : jaskeerat singh");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the array elemensts : ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered the index of array which u want to delete : ");
        int k = sc.nextInt();
        System.out.println("Array after deleting " + k + "rd index element : ");
        arr[k] = 0;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

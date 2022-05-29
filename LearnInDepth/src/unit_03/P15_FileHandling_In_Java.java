package unit_03;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class P15_FileHandling_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
class ABCDEF{
	static int a =10;
	void takeInputFromAFile() throws IOException{
		String path="C:\\Users\\jkchh\\git\\JavaInDepth\\JavaInDepth\\LearnInDepth\\src\\unit_03\\input.txt";
		File file =new File(path);
		FileReader obj=new FileReader(file);
		BufferedReader br=new BufferedReader(obj) ;
		String st;
		List<String> listOfStrings =new ArrayList<String>();
		
		//read entire line of a string
		String line=br.readLine();
		while(line!=null)
		{
			listOfStrings.add(line);
			line =br.readLine();
		}
		listOfStrings.remove(0);
		
		for(String str:listOfStrings) {
			System.out.println(str);
		}
		System.out.println("\n");

		br.close();//discuss in miultithreading
	}
	//how to create log using java
	void saveOutputIntoAFile()throws IOException
	{
		FileWriter myObj=null;
		
	}
}

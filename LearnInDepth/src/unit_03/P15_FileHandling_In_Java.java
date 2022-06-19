package unit_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class P15_FileHandling_In_Java {
	public static void main(String[] args) throws IOException {

		ABCDEF obj = new ABCDEF();
		obj.takeInputFromAFile();
		 obj.saveOutputIntoAFile();
		 obj.saveLogOfProgram();

	}
};
class ABCDEF {
	
	static int a = 10;

	void takeInputFromAFile() throws IOException {

		String path = "C:\\Users\\jkchh\\git\\JavaInDepth\\JavaInDepth\\LearnInDepth\\src\\unit_03\\input.txt";
		File file = new File(path);

		BufferedReader br = new BufferedReader(new FileReader(file));

//		String st;
//		while ((st = br.readLine()) != null) {
//			System.out.println(st);
//		}
		//returns when new line character (/n) is found
		
//		int c;
//		while((c=br.read())!=-1) {
//			System.out.println((char)c);
//		}
		//above code read 2-2 bytes from the given file
		//because it integrate the ASCII format and in java char take 2 bytes to store any character

		// list that holds strings of a file
//		List<String> listOfStrings = new ArrayList<String>();
//
//		// read entire line as string
//		String line = br.readLine();
//
//		while (line != null) {
//			listOfStrings.add(line);
//			line = br.readLine();
//		}
//
//		for (String str : listOfStrings) {
//			System.out.println(str);
//		}
//		System.out.println("\n");
//		br.close();
//		Read Char by char
				int c;
				while ((c = br.read()) != -1) {
					System.out.println((char) c);
				}
				
				
				//Read byte by byte [Load as binary]
//				byte[] bytes = Files.readAllBytes(Paths.get(path));
//				
//				for (int i = 0; i < bytes.length ; i++) {
//					System.out.println(bytes[i]);
//					System.out.println((char)bytes[i]);
//				}
//		 Object read;
//		read byte by byte
//		 byte[] bytes1=Files.readAllBytes(Paths.get(path));
//		 for(int i=0;i<bytes1.length;i++) {
//			 System.out.println(bytes1[i]);
//			 System.out.println((char)bytes1[i]);
//		 }
	}

	void saveOutputIntoAFile() throws IOException {

		FileWriter myObj = null;

		try {
			myObj = new FileWriter("C:\\Users\\jkchh\\git\\JavaInDepth\\JavaInDepth\\LearnInDepth\\src\\unit_03\\output.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "Hey this would store in Output file";

		f_writer.write(text);
		f_writer.close();

	}

	void saveLogOfProgram() throws IOException {
		
		a++;
		
		//Find current time and Date of system
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("C:\\Users\\jkchh\\git\\JavaInDepth\\JavaInDepth\\LearnInDepth\\src\\unit_03\\log.txt",true);
		//true indicates the file is open in append mode
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

		try {
			f_writer.write("Value of a: " + a + ", ");
			f_writer.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		f_writer.close();

	}

}



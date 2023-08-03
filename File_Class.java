//Creating a java program to create new file using File class

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class File_Class {
	public static void main(String[] args) {      
		File_Class fc = new File_Class();
		fc.newFile();
	}

	private void newFile() {
	
		String strPath = "",strName= "";
		
		//try-catch-block
		try {
			//creating buffer reader object
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the file name");
			
			strName = br.readLine();//read line from keyboard
			System.out.println("Enter the file path");
			
			strPath = br.readLine();//read line from keyboard
			
			File file = new File(strPath+""+strName+".txt ");
			//method createNewFile() method create blank file
			file.createNewFile();
			
			FileWriter writer = new FileWriter(file);
			writer.write("Hello World");
			writer.close();
			
			//try-catch-block
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
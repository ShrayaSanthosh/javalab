package newproj;
import java.io.*;
import java.util.Scanner;
public class FileHandlingdException {
     public static void main(String[] args) throws IOException, FileNotFoundException{
		char []data=new char[50];
		FileWriter input=null;
		FileReader content=null;
		FileWriter output=null;
		String value="Stringgg";
		try {
			input=new FileWriter("input.txt");
			input.write(value);
			input.flush();
			input.close();
            content=new FileReader("input.txt");
            int len=content.read(data);
            content.close();
            output=new FileWriter("output.txt");
            output.write(data,0,len);
            output.flush();
            output.close();
		}
		catch(IOException e) {
			System.out.println("An Error has occured");
			e.printStackTrace();
		}
		
	}
}


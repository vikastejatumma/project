package java_programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read_data {

	public static void main(String[] args) throws Throwable {
      
		FileReader fr=new FileReader("G:\\vikas.txt");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while((str=br.readLine())!=null)
		{
		  System.out.println(str);	
		}
		
	}

}

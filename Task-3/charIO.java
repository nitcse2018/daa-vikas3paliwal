package myproject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charIO {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader filein =null;
	
		File fr=new File("C:/Users/vicky/Desktop/outputchar.txt");
		FileWriter fileout=null;
		try {
			filein = new FileReader("C:/Users/vicky/Desktop/inputchar.txt");
			fileout=new FileWriter(fr);
			int b;
			while((b=filein.read())!=-1) {
				
				fileout.write((char)b);
			}
		}
		catch(IOException e) {
		System.out.println(e);
		}
		finally {
			if (filein!=null)
			{
				filein.close();
			}
			if(fileout!=null) {
				fileout.close();
			}
		}
	}

}

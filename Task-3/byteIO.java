package myproject;
import java.io.*;
public class byteIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream filein =null;
		FileOutputStream fileout=null;
		try {
			filein = new FileInputStream("C:/Users/vicky/Desktop/inputbyte.txt");
			fileout=new FileOutputStream("C:/Users/vicky/Desktop/outputbyte.txt");
			int b;
			while((b=filein.read())!=-1) {
				fileout.write((byte)b);
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

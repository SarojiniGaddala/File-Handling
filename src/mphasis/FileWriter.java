package mphasis;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter{
	public static void main(String[] args) throws IOException {
		String str = "Hello";
		FileOutputStream outputStream= new FileOutputStream("abc.txt");
		byte[] strToBytes = str.getBytes();
		outputStream.close();
		
		}
	}
	


	
		


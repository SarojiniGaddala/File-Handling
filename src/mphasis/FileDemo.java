package mphasis;
import java.io.File;
import java.io.IOException;

public class FileDemo {
 public static void main(String[] args) {

	File file = new File("E:\\abc.txt");
	try {
	    if(file.createNewFile()) {
		    System.out.println("File got created");
	    }else{
		    System.out.println("File not created");
	    }
	} catch (IOException e) {
		e.printStackTrace();
		
	}
	
 }
}


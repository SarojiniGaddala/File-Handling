package mphasis;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("MyFile.txt",true);
		BufferedWriter b = new BufferedWriter(file);
		b.write("WELCOME");
		b.newLine();
		b.close();
		file.close();
		
			
		}

	}



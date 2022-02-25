package mphasis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\abc.txt");
		Scanner scan = new Scanner(file);
		System.out.println(scan.nextLine());
	}
		
	}


	
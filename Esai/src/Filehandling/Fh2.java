package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fh2 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("sudha.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
	}

}


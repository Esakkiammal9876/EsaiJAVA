package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fh {
	public static void main(String[] args) throws IOException {
		File f = new File("l1.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("kjBAixbinsaos");
		bw.newLine();
		bw.write("kjabxiibxl");
		bw.newLine();
		bw.write("bye");
		bw.newLine();
		bw.write("welcome");
		bw.newLine();
		bw.close();
	}

}

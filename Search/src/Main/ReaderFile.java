package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Basic Search Algorithms.
 * 
 * Check ReadMe for details on this program and on how to use it.
 * 
 * Authors/Students Numbers: 
 * 			Dieinison Jack Freire Braga / 368339
 * 			Maria Tassiane Barros de Lima / 391052
 * 			Yago da Cruz Ignacio
 * 
 * Institution: 
 * 			Federal University of Ceará, Campus Quixadá 
 */

public class ReaderFile {
	
	private static BufferedReader in;

	public static String[] readFromFile(String filePath) throws IOException {
				
        in = new BufferedReader(new FileReader(filePath));
        String read = in.readLine();
        String[] splited = read.split("\\s+");
        return splited;
	}

}

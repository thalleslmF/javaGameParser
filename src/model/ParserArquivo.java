package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParserArquivo {
	public static Scanner abreArquivo(){
		File file = new File("games.log");
		System.out.println(file);
		Scanner input = null;
		try {
			input = new Scanner(file);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return input;
	}
	
	
}

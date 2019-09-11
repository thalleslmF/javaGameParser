package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParserArquivo {
	/**
	 * @author adm
	 * abre arquivo e retorna leitor do arquivo
	 */
	public static Scanner abrirArquivo(){
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
	/**
	 * @author adm
	 * Função para leitura do arquivo e popular o game com os dados 
	 */
	public static String lerArquivo(Scanner input, ArrayList<Game> games) {
		
		String linha;
		int id=0;
		while(input.hasNext()) {
			
			linha = input.nextLine();
		    if(linha.contains("InitGame") ){
		    	
		    	Game game = new Game(); 
		    	
		    	while(input.hasNext() && !(linha = input.nextLine()).contains("0:00")) {
		    		game.popularDadosRelatorio(linha);
		    	}
		    	game.setId(id);
		    	id++;
		    	games.add(game);
		    	
		    }
		    
		}
		return games.toString();
	}
	
	
}

package service.game;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParserArquivo {
	public  Scanner abrirArquivo(){
		ClassLoader classLoader = getClass().getClassLoader();
		  File file = new File(classLoader.getResource("games.log").getFile());
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
	public static String lerArquivo(Scanner input, ArrayList<Game> games) {
		
		String linha;
		while(input.hasNext()) {
			int id=0;
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

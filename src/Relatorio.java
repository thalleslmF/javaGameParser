import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Game;
import model.ParserArquivo;

public class Relatorio {
public static void main(String[] args) {
	ArrayList<Game> games = new ArrayList<>();
	String linha;
	ParserArquivo parser = new ParserArquivo();
	Scanner input = ParserArquivo.abreArquivo();
	
	while(input.hasNext()) {
		int id=0;
		linha = input.nextLine();
	    if(linha.contains("InitGame") ) {
	    	
	    	Game game = new Game(); 
	    	
	    	while(input.hasNext() && !(linha = input.nextLine()).contains("0:00")) {
	    		game.popularDadosRelatorio(linha);
	    	}
	    	game.setId(id);
	    	id++;
	    	games.add(game);
	    	
	    	System.out.println(game.getTotalMortes());
	    	System.out.println(game.getJogadores());
	    }
	    
	}
}
}

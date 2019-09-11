import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Game;
import model.Jogador;
import model.ParserArquivo;

public class Relatorio {
public static void main(String[] args) {
	ArrayList<Game> games = new ArrayList<>();
	
	ParserArquivo parser = new ParserArquivo();
	Scanner input = ParserArquivo.abrirArquivo();
	ParserArquivo.lerArquivo(input,games);
	int i=0;
	for (Game game : games) {
		System.out.println("RELATÓRIO JOGO: "+(i+1));
		System.out.println("\n Total Kills: "+game.getTotalMortes());
		System.out.println("\n Players: ");
		for (Jogador jogador : game.getJogadores()) {
			System.out.println(jogador.getNome());
		}
		System.out.println("\n Kills: "+game.getJogadores());
		i++;
	}
		
	
	
	}
}


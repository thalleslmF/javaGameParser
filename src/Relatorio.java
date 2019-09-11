import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Game;
import model.Jogador;
import model.ParserArquivo;

public class Relatorio {
public static void main(String[] args) {
	int indice;
	ArrayList<Game> games = new ArrayList<>();
	ArrayList<Jogador> totalJogadores = new ArrayList<Jogador>();
	ParserArquivo parser = new ParserArquivo();
	Scanner input = ParserArquivo.abrirArquivo();
	ParserArquivo.lerArquivo(input,games);
	int i=0;
	for (Game game : games) {
		System.out.println("\nRELATÓRIO JOGO: "+game.getId());
		System.out.println(" Total Kills: "+game.getTotalMortes());
		System.out.print("Players:[");
		for (Jogador jogador : game.getJogadores()) {
			System.out.print(jogador.getNome()+",");
			if(( indice=totalJogadores.indexOf(jogador)) != -1) {
				totalJogadores.get(indice).setMortes(totalJogadores.get(indice).getMortes()+jogador.getMortes());
			}else {
				totalJogadores.add(jogador);
			}
		}
		System.out.println("]\nKills: "+game.getJogadores());
		
		i++;
	}
	System.out.println("\nRelatorio Total Kills");
	for(Jogador jogador:totalJogadores) {
		System.out.println(jogador);
	}
	System.out.println("\nRelatorio Tipo Mortes");
	for(Game game:games) {
		System.out.println("Game: "+game.getId());
		System.out.println(game.getTipoMortes());
	}
	
	}
}


package service.game;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GameController {
	@RequestMapping("/game")
	public String game(@RequestParam(value="id",required=false)int id) {
		ArrayList<Game> games = new ArrayList<>();
		
		ArrayList<Jogador> totalJogadores = new ArrayList<Jogador>();
		ParserArquivo parser = new ParserArquivo();
		Scanner input = parser.abrirArquivo();
		ParserArquivo.lerArquivo(input,games);
		return games.get(id).toString();
	}
	

}

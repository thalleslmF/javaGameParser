package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import model.Game;
import model.ParserArquivo;
class ParserArquivoTest {
	
	@Test
	void testAbreArquivo() throws FileNotFoundException {
		assertEquals(new Scanner(new File("games.log")).nextLine(),ParserArquivo.abrirArquivo().nextLine());
	}
	@Test
	void testLerArquivo() throws FileNotFoundException   {
		ArrayList<Game >games  = new ArrayList<Game>();
		assertEquals("[[Mocinha: 1, Isgalamido: -4]Kills:7]" 
		,ParserArquivo.lerArquivo(new Scanner(new File("gamestext.txt")),games));
	}
	
}

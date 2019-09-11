package model;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
class ParserArquivoTest {
	
	@Test
	void testAbreArquivo() throws FileNotFoundException {
		assertEquals(new Scanner(new File("games.log")).nextLine(),ParserArquivo.abreArquivo().nextLine());
	}

}

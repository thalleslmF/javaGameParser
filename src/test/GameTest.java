package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Game;

class GameTest {
	Game game;
	
	@Test
	void testPopula() {
		Game game = new Game();
		assertEquals("1[Dono da Bola0, Isgalamido1]",game.popularDadosRelatorio("2:22 Kill: 3 2 10: Isgalamido killed Dono da Bola by MOD_RAILGUN"));
	}

}

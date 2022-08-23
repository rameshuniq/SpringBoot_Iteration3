package com.uniqTechnologies.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	@Qualifier("pacManGame")
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}

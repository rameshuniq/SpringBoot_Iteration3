package com.uniqTechnologies.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.uniqTechnologies.learnspringframework.game.GameRunner;
import com.uniqTechnologies.learnspringframework.game.MarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// SuperContraGame game = new SuperContraGame();
		// PacManGame game = new PacManGame();

		GameRunner runner = context.getBean(GameRunner.class);

		// MarioGame game = new MarioGame();
		// GameRunner runner = new GameRunner(game);

		runner.runGame();
	}

}

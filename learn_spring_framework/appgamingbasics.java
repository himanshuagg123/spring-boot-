package com.himanshuproject1.learn_spring_framework;

import com.himanshuproject1.learn_spring_framework.game.gamerunner;
import com.himanshuproject1.learn_spring_framework.game.mariogame;
import com.himanshuproject1.learn_spring_framework.game.supercontragame;

public class appgamingbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var game = new mariogame();
//		var game = new supercontragame();
		var gamerunner = new gamerunner(game);
		gamerunner.run();
 
	}

}

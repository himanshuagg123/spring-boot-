package com.himanshuproject1.learn_spring_framework.game;

public class gamerunner {
	console  game;
	
	public gamerunner(console game) {
		this.game= game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running game:" + game);
		game.up();
		game.down();
		game.left();
//		game.right();
		
		
	}
	

}

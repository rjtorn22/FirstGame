package main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player {
	
	private double x;
	private double y;
	Main game;
	private BufferedImage player;
	
	public Player(double newX, double newY, Main newGame){
		x = newX;
		y = newY;
		SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
		player = ss.grabImage(1, 1, 32, 32);
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		g.drawImage(player, (int)x, (int)y, null);
	}
}

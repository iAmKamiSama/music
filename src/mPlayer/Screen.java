package mPlayer;

import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public abstract class Screen {
	MusicPlayer mp;
	BufferedImage screenImage;
	KeyListener keyListener;
	int width;
	int height;
	
	//Game is a parameter here so that every screen can control the game while it is active
	public Screen(MusicPlayer mp){
		this.mp = mp;
		screenImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = (Graphics2D)screenImage.getGraphics();
		paintScreen(g2);
	}
	
	public abstract void paintScreen(Graphics2D g2);
	
	public abstract MouseListener getMouseListener();

	//returns the image of this screen (to be painted in the Game JFrame)
	//final makes it impossible to override this method
	public final BufferedImage getScreenImage(){
		return screenImage;
	}
}

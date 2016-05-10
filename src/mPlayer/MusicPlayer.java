package mPlayer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MusicPlayer extends JFrame implements KeyListener{
	//USE MOUSECLICKLISTENER INSTEAD OF BUTTONS
	int width = 500;
	int height = 500;
	Color lightBlue = new Color(120, 189, 245, 1);
	BufferedImage landscape;
	Screen currentScreen;
	
	public static void main(String[] args)	{
		new MusicPlayer();
		ArrayList<ArrayList<String>> info = new ArrayList<ArrayList<String>>();
		
		info.get(0).add("Shake it off");
		info.get(0).add("The Hills");
		info.get(0).add("Can't feel my Face");
		info.get(0).add("Hotline Bling");
		info.get(0).add("Jumpman");
		
		info.get(2).add(new Artist())
	}
	
	public MusicPlayer(){
		//JFrame methods
		landscape = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = (Graphics2D)landscape.getGraphics();
		paintLandscape(g2);
		setVisible(true);
		//makes the window visible
		setSize(width,height);
		//sets size of the window in pixels
		setLocation(200,150);
		//sets where the window pops up at, 200 to the right, 150 down
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sets how it closes; static constant reference for special close operations
		addKeyListener(this);
	}
	
	private void reset() {
		Screen startScreen = new StartScreen(this);
		setScreen(startScreen);
	}
	
	public void setScreen(Screen newScreen) {
		if(currentScreen!=null)removeMouseListener(currentScreen.getMouseListener());

		currentScreen=newScreen;
		repaint();//so that the old screen is no longer visible
		addMouseListener(currentScreen.getMouseListener());
		
	}

	public void paintLandscape(Graphics2D g2) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

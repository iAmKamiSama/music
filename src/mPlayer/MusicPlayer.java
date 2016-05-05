package mPlayer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MusicPlayer extends JFrame implements KeyListener{
	//https://docs.oracle.com/javase/tutorial/uiswing/components/button.html
	//JButton things
	int width = 500;
	int height = 500;
	Color lightBlue = new Color(120, 189, 245, 1);
	BufferedImage landscape;
	boolean touching = false;
	
	public static void main(String[] args)	{
		new MusicPlayer();
	}
	
	public MusicPlayer(){
		//JFrame methods
		landscape = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		ImageIcon prevButton = new ImageIcon("resources/previous.jpg");
		ImageIcon playButton = new ImageIcon("resources/playButton.jpg");
		ImageIcon nextButton = new ImageIcon("resources/next.jpg");
		JButton b1 = new JButton(prevButton);
		JButton b2 = new JButton(playButton);
		JButton b3 = new JButton(nextButton);
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

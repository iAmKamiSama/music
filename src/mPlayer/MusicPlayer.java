package mPlayer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		JButton b1 = new JButton();
		b1.setAction(previousSong());
		JButton b2 = new JButton();
		b2.setAction(playSong());
		JButton b3 = new JButton();
		b3.setAction(nextSong());
		try {
		    Image prevButton = ImageIO.read(getClass().getResource("resources/previous.jpg"));
		    b1.setIcon(new ImageIcon(prevButton));
		    Image playButton = ImageIO.read(getClass().getResource("resources/playButton.jpg"));
		    b2.setIcon(new ImageIcon(playButton));
		    Image nextButton = ImageIO.read(getClass().getResource("resources/next.jpg"));
		    b3.setIcon(new ImageIcon(nextButton));
		  } catch (IOException ex) {
		  }
		JPanel buttons = new JPanel();
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		JFrame frame = new JFrame();
		frame.add(buttons);
		Graphics2D g2 = (Graphics2D)landscape.getGraphics();
		paintLandscape(g2);
		frame.setVisible(true);
		//makes the window visible
		frame.setSize(width,height);
		//sets size of the window in pixels
		frame.setLocation(200,150);
		//sets where the window pops up at, 200 to the right, 150 down
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sets how it closes; static constant reference for special close operations
		frame.addKeyListener(this);
	}

	private Action nextSong() {
		// TODO Auto-generated method stub
		return null;
	}

	private Action playSong() {
		// TODO Auto-generated method stub
		return null;
	}

	private Action previousSong() {
		// TODO Auto-generated method stub
		return null;
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

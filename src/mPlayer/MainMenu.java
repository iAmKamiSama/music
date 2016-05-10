package mPlayer;

import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class MainMenu extends Screen {
	
	BufferedImage cover;
	

	public MainMenu(MusicPlayer mp) {
		super(mp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paintScreen(Graphics2D g2) {
		// TODO Auto-generated method stub
		cover = null;
		try{
		URL url = getClass().getResource("/resources/next.jpg"); 
		cover = ImageIO.read(url);
		}catch(Exception e){
		e.printStackTrace();
		}
		g2.drawImage(cover, 0, 0, null);
	}

	@Override
	public MouseListener getMouseListener() {
		// TODO Auto-generated method stub
		return null;
	}

}

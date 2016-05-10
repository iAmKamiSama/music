package mPlayer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StartScreen extends Screen implements MouseListener{

	public StartScreen(MusicPlayer mp){
		super(mp);
	}
	public void mouseClicked(MouseEvent m) {
		// TODO Auto-generated method stub
		if (m.getButton() == MouseEvent.BUTTON1){
			Screen mainMenu = new MainMenu(mp);
			mp.setScreen(mainMenu);
		}
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paintScreen(Graphics2D g2) {
		g2.setColor(Color.white);
		g2.fillRect(0, 0, width, height);
		g2.setColor(Color.black);
		UtilityMethods.centerText(g2, "Press anywhere on the screen to start", width, height);
	}
	@Override
	public MouseListener getMouseListener() {
		// TODO Auto-generated method stub
		return this;
	}

}

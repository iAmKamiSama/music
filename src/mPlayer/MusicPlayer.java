package mPlayer;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.*;

public class MusicPlayer extends JFrame implements MouseListener {
	private static JFrame frame;
	private boolean isPlaying = false;
	private JPanel pages;
	//different pages w/ content
	private JPanel lyrics;
	//lyrics page for cSong
	private JPanel songSelection;
	private JPanel playlistSelection;
	private JPanel albumSelection;
	private JPanel categories;
	private static JLabel trackLabel;
	private JLabel playlistLabel;
	private JLabel albumLabel;
	private static JPanel display;
	//different sorted categories
	private JLabel cSong;
	//current song label;
	private JPanel controlsLabel;
	private JLabel next;
	private JPanel pButton;
	private JLabel prev;
	//play/pause, next, previous
	//http://www.tutorialspoint.com/swing/swing_jpanel.htm
	public static void main(String[] args)	{
		MusicPlayer MusicPlayer = new MusicPlayer();
	}
	
	public MusicPlayer(){
		//MAKES GUI
		prepare();
	}
	
	private void prepare(){
		//makes the frame
		frame = new JFrame("Music Player");
		frame.setSize(800,800);
		frame.setLayout(new GridLayout(5, 1, 0, 10));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//organized categories: Songs/Tracks, Playlist, Album, Artist(Optional)
		categories = new JPanel();
		categories.setLayout(new FlowLayout());
		//labels to add to categories
		trackLabel = new JLabel("Tracks", JLabel.LEFT);
		trackLabel.addMouseListener(this);
		trackLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		playlistLabel = new JLabel("Playlists");
		playlistLabel.addMouseListener(this);
		playlistLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		albumLabel = new JLabel("Albums", JLabel.RIGHT);
		albumLabel.addMouseListener(this);
		albumLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		categories.add(trackLabel);
		categories.add(playlistLabel);
		categories.add(albumLabel);
		frame.add(categories);
		//pages bar (page 1, page 2, etc...)
		pages = new JPanel();
		pages.setLayout(new FlowLayout());
		pages.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		display = new JPanel();
		display.setLayout(new FlowLayout());
		frame.add(display);
		cSong = new JLabel("SONG", JLabel.CENTER);
		frame.add(cSong);
		controlsLabel = new JPanel();
		next = new JLabel("NEXT");
		next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		next.addMouseListener(this);
		pButton = new JPanel();
		pButton.add(new JLabel("PAUSE"));
		pButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pButton.addMouseListener(this);
		prev = new JLabel("PREV");
		prev.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		prev.addMouseListener(this);
		controlsLabel.add(prev);
		controlsLabel.add(pButton);
		controlsLabel.add(next);
		frame.add(controlsLabel);
		frame.addMouseListener(this);
		frame.setVisible(true);
	}
	//finds out the amount of pages needed for songs tab
	private int genSongPgNum(ArrayList<Songs> arrList){
		return arrList.size()/6 + 1;
	}
	//finds out the amount of pages needed for playlist tab
	private int genPlaylistPgNum(ArrayList<Songs> playlist){
		return playlist.size()/6 + 1;
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getComponent() == trackLabel){
			display.removeAll();
			display.add(new JLabel("SONGS"));
			frame.validate();
			frame.repaint();
		}
		if (e.getComponent() == playlistLabel){
			display.removeAll();
			display.add(new JLabel("PLAYLISTS"));
			frame.validate();
			frame.repaint();
		}
		if (e.getComponent() == albumLabel){
			display.removeAll();
			display.add(new JLabel("ALBUMS"));
			frame.validate();
			frame.repaint();
		}
		if (e.getComponent() == pButton && isPlaying){
			pButton.removeAll();
			pButton.add(new JLabel("PAUSE"));
			pButton.addMouseListener(this);
			isPlaying = false;
			frame.validate();
			frame.repaint();
		}
		if (e.getComponent() == pButton && !isPlaying){
			try{
				pButton.removeAll();
				pButton.add(new JLabel("PLAY"));
				pButton.addMouseListener(this);
				isPlaying = true;
				frame.validate();
				frame.repaint();
			}
			
		}
	}
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		if (e.getComponent() == trackLabel){
//			songDisplay.add(new JLabel("test works!!"));
//		}
	}
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

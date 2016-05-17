package mPlayer;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.*;

public class MusicPlayer extends JFrame{
	private static JFrame frame;
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
	private static JPanel songDisplay;
	//different sorted categories
	private JLabel cSong;
	//current song label;
	private JLabel controlsLabel;
	//play/previous, next, pause
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
		trackLabel.setLabelFor(trackLabel);
		trackLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		playlistLabel = new JLabel("Playlists");
		playlistLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		albumLabel = new JLabel("Albums", JLabel.RIGHT);
		albumLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		categories.add(trackLabel);
		categories.add(playlistLabel);
		categories.add(albumLabel);
		frame.add(categories);
		//pages bar (page 1, page 2, etc...)
		pages = new JPanel();
		pages.setLayout(new FlowLayout());
		pages.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		songDisplay = new JPanel();
		songDisplay.setLayout(new FlowLayout());
		frame.add(songDisplay);
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

	static class MyMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JComponent ref = (JComponent) e.getComponent();
			if (ref == trackLabel){
				
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
	}
}

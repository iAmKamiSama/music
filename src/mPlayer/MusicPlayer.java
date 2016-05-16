package mPlayer;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.*;

public class MusicPlayer extends JFrame {
	private JFrame frame;
	private JPanel pages;
	//different pages w/ content
	private JPanel lyrics;
	//lyrics page for cSong
	private JPanel songSelection;
	private JPanel playlistSelection;
	private JPanel albumSelection;
	private JPanel categories;
	private JLabel trackLabel;
	private JLabel playlistLabel;
	private JLabel albumLabel;
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
		//label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//changes mouse pointer
		frame = new JFrame("Music Player");
		frame.setSize(800,800);
		frame.setLayout(new GridLayout(5, 1, 0, 10));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		categories = new JPanel();
		categories.setLayout(new FlowLayout());
		//organized categories: Songs/Tracks, Playlist, Album, Artist(Optional)
		trackLabel = new JLabel("Tracks", JLabel.LEFT);
		trackLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		playlistLabel = new JLabel("Playlists");
		playlistLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		albumLabel = new JLabel("Albums", JLabel.RIGHT);
		albumLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		categories.add(trackLabel);
		categories.add(playlistLabel);
		categories.add(albumLabel);
		frame.add(categories);
		pages = new JPanel();
		pages.setLayout(new FlowLayout());
		pages.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.setVisible(true);
	}
	private int genSongPgNum(ArrayList<Songs> arrList){
		return arrList.size()/6 + 1;
	}
	private int genPlaylistPgNum(ArrayList<Songs> playlist){
		return playlist.size()/6 + 1;
	}
}

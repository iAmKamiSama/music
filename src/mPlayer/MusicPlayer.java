package mPlayer;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class MusicPlayer extends JFrame implements MouseListener {
	//Alexis' Class
	private static JFrame frame;
	private static boolean songs = true;
	private static boolean album = false;
	private static boolean playlist = false;
	private int currPageNum = 1;
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
	private JLabel pauseButton;
	private JLabel prev;
	private JLabel playButton;
	//play/pause, next, previous
	private JLabel nextPage;
	private JLabel prevPage;
	private JLabel display1;
	private JLabel display2;
	private JLabel display3;
	private JLabel display4;
	private JLabel display5;
	private JLabel display6;
	//http://www.tutorialspoint.com/swing/swing_jpanel.htm
//	public static void main(String[] args) throws IOException	{
//		MusicPlayer MusicPlayer = new MusicPlayer();
//		Music.test();
//	}
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
		display.setLayout(new GridLayout(6, 1));
		frame.add(display);
		cSong = new JLabel("No Songs Playing", JLabel.CENTER);
		cSong.addMouseListener(this);
		frame.add(cSong);
		controlsLabel = new JPanel();
		pages = new JPanel();
		prevPage = new JLabel("Previous Page");
		prevPage.addMouseListener(this);
		JLabel currPage = new JLabel("" + currPageNum);
		nextPage = new JLabel("Next Page");
		nextPage.addMouseListener(this);
		prevPage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		nextPage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pages.add(prevPage);
		pages.add(currPage);
		pages.add(nextPage);
		frame.add(pages);
		next = new JLabel("NEXT");
		next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		next.addMouseListener(this);
		pauseButton = new JLabel("PAUSE");
		pauseButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pauseButton.addMouseListener(this);
		playButton = new JLabel("PLAY");
		playButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		playButton.addMouseListener(this);
		prev = new JLabel("PREV");
		prev.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		prev.addMouseListener(this);
		controlsLabel.add(prev);
		controlsLabel.add(playButton);
		controlsLabel.add(next);
		frame.add(controlsLabel);
		displayCurrentSongs(currPageNum);
		frame.addMouseListener(this);
		frame.setVisible(true);
	}
	//finds out the amount of pages needed for songs tab
	private void displayCurrPage(){
		
	}
	public static int genSongPgNum(ArrayList<Songs> songList){
		return songList.size()/6 + 1;
	}
	//finds out the amount of pages needed for playlist tab
	public static int genPlaylistPgNum(ArrayList<PlayLists> playlists){
		return playlists.size()/6 + 1;
	}
	public static int genAlbumPgNum(ArrayList<Albums> albums){
		return albums.size()/6 + 1;
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getComponent() == trackLabel){
			currPageNum = 1;
			display.removeAll();
			displayCurrentSongs(currPageNum);
			frame.validate();
			frame.repaint();
		}
		else if (e.getComponent() == playlistLabel){
			currPageNum = 1;
			display.removeAll();
			display.add(new JLabel("PLAYLISTS", JLabel.CENTER));
			frame.validate();
			frame.repaint();
		}
		else if (e.getComponent() == albumLabel){
			currPageNum = 1;
			display.removeAll();
			display.add(new JLabel("ALBUMS", JLabel.CENTER));
			frame.validate();
			frame.repaint();
		}
		else if (e.getComponent() == playButton){
			controlsLabel.removeAll();
			controlsLabel.add(prev);
			controlsLabel.add(pauseButton);
			controlsLabel.add(next);
			frame.validate();
			frame.repaint();
		}
		else if (e.getComponent() == pauseButton){
			controlsLabel.removeAll();
			controlsLabel.add(prev);
			controlsLabel.add(playButton);
			controlsLabel.add(next);
			frame.validate();
			frame.repaint();
		}
		else if (e.getComponent() == nextPage){
			if (songs){
				if (currPageNum < backupDemo.songPages){
					currPageNum++;
					pages.removeAll();
					pages.add(prevPage);
					pages.add(new JLabel("" + currPageNum));
					pages.add(nextPage);
					displayCurrentSongs(currPageNum);
					frame.validate();
					frame.repaint();
				}
			}
			else if (playlist){
				if (currPageNum < backupDemo.playlistPages){
					currPageNum++;
					pages.removeAll();
					pages.add(prevPage);
					pages.add(new JLabel("" + currPageNum));
					pages.add(nextPage);
					displayCurrentPlaylists(currPageNum);
					frame.validate();
					frame.repaint();
				}
			}
			else if (album){
				if (currPageNum < backupDemo.albumPages){
					currPageNum++;
					pages.removeAll();
					pages.add(prevPage);
					pages.add(new JLabel("" + currPageNum));
					pages.add(nextPage);
					displayCurrentAlbums(currPageNum);
					frame.validate();
					frame.repaint();
				}
			}
		}
		else if (e.getComponent() == prevPage && currPageNum > 1){
			currPageNum--;
			pages.removeAll();
			pages.add(prevPage);
			pages.add(new JLabel("" + currPageNum));
			pages.add(nextPage);
			displayCurrentSongs(currPageNum);
			frame.validate();
			frame.repaint();
		}
		else if (e.getComponent() == display1){
			System.out.println(display1.getText());
			cSong.setText(display1.getText());;
		}
		else if (e.getComponent() == display2){
			System.out.println(display2.getText());
			cSong.setText(display2.getText());;
		}
		else if (e.getComponent() == display3){
			System.out.println(display3.getText());
			cSong.setText(display3.getText());;
		}
		else if (e.getComponent() == display4){
			System.out.println(display4.getText());
			cSong.setText(display4.getText());;
		}
		else if (e.getComponent() == display5){
			System.out.println(display5.getText());
			cSong.setText(display5.getText());;
		}
		else if (e.getComponent() == display6){
			System.out.println(display6.getText());
			cSong.setText(display6.getText());;
		}
		else if (e.getComponent() == next){
			findNextSong(cSong.getText());
		}
		else if (e.getComponent() == prev){
			findPrevSong(cSong.getText());
		}
	}
	private void findPrevSong(String song) {
		// TODO Auto-generated method stub
		for (int i = 0; i < backupDemo.songs.size(); i++){
			if (backupDemo.songs.get(i).getName() == song && i - 1 >= 0){
				cSong.setText(backupDemo.songs.get(i-1).getName());
				break;
			}
		}
	}

	private void findNextSong(String song) {
		// TODO Auto-generated method stub
		for (int i = 0; i < backupDemo.songs.size(); i++){
			if (backupDemo.songs.get(i).getName() == song && i + 1 < backupDemo.songs.size()){
				cSong.setText(backupDemo.songs.get(i+1).getName());
				break;
			}
		}
	}

	private void displayCurrentSongs(int page) {
		// TODO Auto-generated method stub
		display.removeAll();
		for (int i = 0; i < backupDemo.songs.size(); i++){
			System.out.println(backupDemo.songs.get(i).getName());
		}
		int z = ((page - 1) * 6);
		System.out.println(z);
		System.out.println(z+1);
		System.out.println(z+2);
		System.out.println(z+3);
		System.out.println(z+4);
		System.out.println(z+5);
		if (z < backupDemo.songs.size()){
			display1 = new JLabel(backupDemo.songs.get(z).getName() + " By: " + backupDemo.artists.get(z).getName(), JLabel.CENTER);
			display1.addMouseListener(this);
			display.add(display1);
		}
		if (z + 1 < backupDemo.songs.size()){
			display2 = new JLabel(backupDemo.songs.get(z+1).getName() + " By: " + backupDemo.artists.get(z+1).getName(), JLabel.CENTER);
			display2.addMouseListener(this);
			display.add(display2);
		}
		if (z + 2 < backupDemo.songs.size()){
			display3 = new JLabel(backupDemo.songs.get(z+2).getName() + " By: " + backupDemo.artists.get(z+2).getName(), JLabel.CENTER);
			display3.addMouseListener(this);
			display.add(display3);
		}
		if (z + 3 < backupDemo.songs.size()){
			display4 = new JLabel(backupDemo.songs.get(z+3).getName() + " By: " + backupDemo.artists.get(z+3).getName(), JLabel.CENTER);
			display4.addMouseListener(this);
			display.add(display4);
		}
		if (z + 4 < backupDemo.songs.size()){
			display5 = new JLabel(backupDemo.songs.get(z+4).getName() + " By: " + backupDemo.artists.get(z+4).getName(), JLabel.CENTER);
			display5.addMouseListener(this);
			display.add(display5);
		}
		if (z + 5 <= backupDemo.songs.size()){
			display6 = new JLabel(backupDemo.songs.get(z+5).getName() + " By: " + backupDemo.artists.get(z+5).getName(), JLabel.CENTER);
			display6.addMouseListener(this);
			display.add(display6);
		}
	}

	private void displayCurrentPlaylists(int page) {
		// TODO Auto-generated method stub
		
	}

	private void displayCurrentAlbums(int page) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

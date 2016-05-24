package mPlayer;

import java.util.ArrayList;

public class Music implements MusicInterface{
	//Xavier's Class
	
	private ArrayList<String> songNames;
	public int[] getLyrics(String songName) {
		//return an int array of 2 numbers, start of the song and end of the song
		//AKA index of song name and index of the next song name
		//can be something like
		//if arraylist.get(i) == songName return the int
		//then look through an arraylist/string array of song names to see which song is next
		//then if arraylist.get(i) == arraylist.findNextSong/array.findNextSong
		//then return that int
		//ie int[] returnval = [0,40];
		int[] returnVal = new int[2];
		return returnVal;
	}
	public int determinePages(int size) {
		// TODO Auto-generated method stub
		if (size%5 > 0) return size/5+1;
		return size/5;
	}
	public String[] getSongs(int start, int end) {
		// TODO Auto-generated method stub
		String[] returnVal = new String[6];
		//for loop to loop through songNames to add them to returnVal
		return null;
	}
	public void playSong(String songName) {
		// TODO Auto-generated method stub
		
	}
	//above methods are from interface from Alexis
	public String[] getSongInfo(Song song){
		return null;
	}
	public void playPrevSong(String currSong) {
		// TODO Auto-generated method stub
		//use currSong(current song) to find which song is before current song and play it
	}
	public void playNextSong(String currSong) {
		// TODO Auto-generated method stub
		//use currSong(current song) to find which song is after current song and play it
	}
}

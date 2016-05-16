package mPlayer;

import java.util.ArrayList;

public class Albums {
	private String name;
	private Artist artist;
	private int year;
	private ArrayList<Songs> songs;
	
	public Albums(String name,int year,ArrayList<Songs> songs,Artist artist){
		this.name = name;
		this.year = year;
		this.songs = songs;
		this.artist = artist;
	}
	
	public int numSongs(){
		return this.songs.size();
	}
	public ArrayList<Songs> getSongs(){
		return this.songs;
	}
}

package mPlayer;

import java.util.ArrayList;

public class Albums {
	private String name;
	private int year;
	private ArrayList<Songs> songs;
	
	public Albums(String name,int year,ArrayList<Songs> songs){
		this.name = name;
		this.year = year;
		this.songs = songs;
	}
	
	public int numSongs(){
		return this.songs.size();
	}
}

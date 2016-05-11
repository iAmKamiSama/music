package mPlayer;

import java.util.ArrayList;

public class Artist {
	private String name;
	private String biography;
	private ArrayList<Albums> albums;
		
	public Artist(String name,ArrayList<Albums> albums,String biography){
		this.name = name;
		this.albums = albums;
		this.biography=biography;
	}
	
	public String getName(){
		return this.name;
	}
	public ArrayList<Albums> getAlbums(){
		return this.albums;
	}
}

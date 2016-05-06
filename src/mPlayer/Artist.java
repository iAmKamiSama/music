package mPlayer;

import java.util.ArrayList;

public class Artist {
	private String name;
	private ArrayList<Albums> albums;
	private String biography;
		
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

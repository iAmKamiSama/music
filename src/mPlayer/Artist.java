package mPlayer;

import java.util.ArrayList;

public class Artist {
	private String name;
	private String biography;
	private ArrayList<Albums> albums;
	
	public static ArrayList<Artist> AllArtists = new ArrayList<Artist>();
	
	public Artist(String name/*,String biography*/){
		this.name = name;
//		this.albums = albums;
//		this.biography=biography;
//		this.albums = new ArrayList<Albums>();
	}
	
	public String getName(){
		return this.name;
	}
	public ArrayList<Albums> getAlbums(){
		return this.albums;
	}
}

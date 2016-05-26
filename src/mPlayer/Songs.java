
package mPlayer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Songs{
	private String name;
	private String lyrics;
	private String genre;
	private Artist artist;
	private int timesPlayed;
	private String length;
	private int rating;
	
	public Songs(String name,String lyrics,Artist artist,String genre,int length, int rating){
		this.name = name;
		this.lyrics = artist.getName() + this.name + lyrics;
		this.genre = genre;
		this.artist = artist;
		this.length = length/60 + ":" + length%60;
		this.timesPlayed= 0;
		PlayLists.generateNewPlayLists();
		this.rating = rating;
		
	}
	public String getLyric() {
		return lyrics;
	}
	public Artist getArtist() {
		return this.artist;
	}
	public double getUserRating() {
		return this.rating;
	}
}

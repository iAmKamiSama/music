
package mPlayer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Songs implements Song{
	private String name;
	private String lyrics;
	private String genre;
	private Artist artist;
	private int timesPlayed;
	private String length;
	private ArrayList<Integer> userRating;
	
	public Songs(String name,String lyrics,Artist artist,String genre,int length){
		this.name = name;
		this.lyrics = artist.getName() + this.name + lyrics;
		this.genre = genre;
		this.artist = artist;
		this.length = length/60 + ":" + length%60;
		this.timesPlayed= 0;
		PlayLists.generateNewPlayLists();
		this.userRating = new ArrayList<Integer>();
		
	}
	public String getLyric() {
		return lyrics;
	}
	public String getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	public Artist getArtist() {
		// TODO Auto-generated method stub
		return this.artist;
	}
	public double getUserRating() {
		double val = 0.0;
		for (int j:this.userRating){
			val += j;
		}
		return val/this.userRating.size();
	}
	public static void addUserRating(int rating) throws IOException {
		Scanner s = new Scanner(new File("15songs.txt"));
		System.out.println(s.nextLine());
		//this.userRating.add(rating);
	}
}

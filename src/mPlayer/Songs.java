package mPlayer;

public class Songs implements Song{
	private String name;
	private String lyrics;
	private String genre;
	private Artist artist;
	private int timesPlayed;
	private String length;
	
	public Songs(String name,String lyrics,Artist artist,String genre,int length){
		this.name = name;
		this.lyrics = artist.getName() + this.name + lyrics;
		this.genre = genre;
		this.artist = artist;
		this.length = length/60 + ":" + length%60;
		this.timesPlayed= 0;
		
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
	
	
}

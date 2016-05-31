
package mPlayer;

import java.io.File;
import java.io.FileNotFoundException;
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
	public static ArrayList<Songs> allSongs;
	
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
	public String getName(){
		return this.name;
	}
	public static void updateSongs() throws IOException{
		String basePath = System.getProperty("user.dir");
		Scanner s= new Scanner(new File(basePath+"/src/mPlayer/resources/musicFile.txt"));
		String str ="";
		String [] songInfo =new String[2];	
		boolean contains=false;
		while (s != null){
			try{
				str = s.nextLine();
				System.out.println(str);
				//Splits info from musicFile
				songInfo = str.split(":");
				//Creates new song and adds to song arrayList
				for(Songs song:allSongs){
					//If song is already in allSongs Arraylist, dont add the song again
					if(song.getName().equals(songInfo[0])){
						contains = true;
					}
				}
				//Creates song and adds to allSongs
				if(!contains){
					allSongs.add(new Songs(songInfo[0],"Default Lyrics",new Artist(songInfo[1],"Default bio"),"Default",100,0));
				}
			}finally{
				if(str==null)break;
			}
	}
}
}

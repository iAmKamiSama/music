package mPlayer;

import java.util.ArrayList;

public class PlayLists {
	private ArrayList<Songs> songs;
	private String name;
	public static ArrayList<PlayLists> allPlaylists;
	
	public PlayLists(String name,ArrayList<Songs> songs){
		this.songs=songs;
		this.name = name;
		allPlaylists.add(this);
	}
	
	public static void generateNewPlayLists(){
		for(Artist artist:Artist.AllArtists){
			for(Albums album:artist.getAlbums()){
				for(Songs song:album.getSongs()){
					//Sort by genre
					
				}
			}
		}
	}
	public static void updatePlaylists(){
		for(PlayLists a:allPlaylists){
			for(Songs s :allSongs){
				
			}
		}
	}
}

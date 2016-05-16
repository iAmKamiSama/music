package mPlayer;

import java.util.ArrayList;

public class PlayLists {
	private ArrayList<Songs> songs;
	private String name;

	
	public PlayLists(String name,ArrayList<Songs> songs){
		this.songs=songs;
		this.name = name;
	}
	
	public static void generateNewPlayLists(){
		for(Artist artist:Artist.AllArtists){
			for(Albums album:artist.getAlbums()){
				for(Songs song:album.getSongs()){
					
				}
			}
		}
	}
}

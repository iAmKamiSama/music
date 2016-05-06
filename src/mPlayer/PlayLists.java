package mPlayer;

import java.util.ArrayList;

public class PlayLists {
	public ArrayList<Songs> songs;
	public String name;
	
	public PlayLists(String name,ArrayList<Songs> songs){
		this.songs=songs;
		this.name = name;
	}
}

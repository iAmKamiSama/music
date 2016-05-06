package mPlayer;

import java.util.ArrayList;

public interface Playlist {
	public ArrayList<Song> getSong();
	public void shuffleSongs();
	public Song removeSong();
	public void AddSong();
}

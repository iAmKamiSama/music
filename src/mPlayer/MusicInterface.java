package mPlayer;

import java.util.ArrayList;

public interface MusicInterface {
	public int[] getLyrics(String songName);
	
	public int determinePages(int size);
	//divide the things by 5 and see how many pages we need
	
	public String[] getSongs(int start, int end);
	
	public void playSong (String songName);
}

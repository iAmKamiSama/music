package mPlayer;

import java.util.ArrayList;

public interface MusicInterface {
	public int[] getLyrics(String songName);
	//return an int array of 2 numbers, start of the song and end of the song
	//AKA index of song name and index of the next song name
}

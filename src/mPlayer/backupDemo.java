package mPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class backupDemo extends MusicPlayer{
	static ArrayList<Songs> songs = new ArrayList();
	static ArrayList<PlayLists> playlists = new ArrayList();
	static ArrayList<Albums> albums = new ArrayList();
	static int songPages;
	static int playlistPages;
	static int albumPages;
	private static void genThings() throws IOException{
		String basePath = System.getProperty("user.dir");
		Scanner s= new Scanner(new File(basePath+"/src/mPlayer/resources/songs"));
		Scanner a = new Scanner(new File(basePath+"/src/mPlayer/resources/artists"));
		String song = "";
		String artist = "";
		while (s.hasNextLine() && a.hasNextLine()){
			song = s.nextLine();
			artist = a.nextLine();
			songs.add(new Songs(song,new Artist(artist)));
		}
	}
	public static void main(String[] args) throws IOException	{
		genThings();
		songPages = genSongPgNum(songs);
		playlistPages = genPlaylistPgNum(playlists);
		albumPages = genAlbumPgNum(albums);
		MusicPlayer MusicPlayer = new MusicPlayer();
//		Music.test();
	}
}
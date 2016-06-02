package mPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class backupDemo {
	static ArrayList<Songs> songs = new ArrayList();
	ArrayList<PlayLists> playlists = new ArrayList();
	ArrayList<Albums> albums = new ArrayList();

	private static void genThings() throws IOException{
		String basePath = System.getProperty("user.dir");
		Scanner s= new Scanner(new File(basePath+"/src/mPlayer/resources/songs.txt"));
		String str ="";
		while (s.hasNextLine()){
			str = s.nextLine();
			songs.add(str);
		}
	}
}
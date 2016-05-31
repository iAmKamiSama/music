package mPlayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;

public class Music implements MusicInterface{
	//Xavier's Class
	
	private ArrayList<String> songNames;
	private ArrayList<ArrayList> playlist;
	private ArrayList<ArrayList> albums;
	public int[] getLyrics(String songName) {
		//return an int array of 2 numbers, start of the song and end of the song
		//AKA index of song name and index of the next song name
		//can be something like
		//if arraylist.get(i) == songName return the int
		//then look through an arraylist/string array of song names to see which song is next
		//then if arraylist.get(i) == arraylist.findNextSong/array.findNextSong
		//then return that int
		//ie int[] returnval = [0,40];
		int[] returnVal = new int[2];
		return returnVal;
	}
	public int determinePages(int size) {
		if (size%5 > 0) return size/5+1;
		return size/5;
	}
	public String[] getSongs(int start, int end) {
		String[] returnVal = new String[6];
		//for loop to loop through songNames to add them to returnVal
		return null;
	}
	public void playSong(String songName) {
		
	}
	public void playPrevSong(String currSong) {
		//use currSong(current song) to find which song is before current song and play it
	}
	public void playNextSong(String currSong) {
		//use currSong(current song) to find which song is after current song and play it
	}
	//above methods are from interface from Alexis
	public String[] getSongInfo(Songs song){
		return null;
	}
	public static void test() throws IOException {
		String basePath = System.getProperty("user.dir");
		Scanner s= new Scanner(new File(basePath+"/src/mPlayer/resources/musicFile.txt"));
		String str ="";
		while (s != null){
			try{
				str = s.nextLine();
			}finally{
				if(str==null)break;
			}
		}
//		String csvFile = "C:/Users/Student8/git/music/src/mPlayer/musicFile.txt";
//		System.out.println(new File("C:/Users/Student8/git/music/src/mPlayer/musicFile.txt"));
//		BufferedReader br = null;
//		String line = "";
//		String cvsSplitBy = ":";
//
//	
//			try {
//				br = new BufferedReader(new FileReader(csvFile));
//				while ((line = br.readLine()) != null) {
//					//do things with line of text
//					String[] asd = line.split(cvsSplitBy);
//					for (String a : asd){
//						System.out.println(asd);
//					}
//				}
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//			
//
	}
}

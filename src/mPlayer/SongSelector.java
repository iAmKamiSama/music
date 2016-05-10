package mPlayer;

public class SongSelector extends ObjectSelector{
	private Artist artist;
	public SongSelector(String name, String imgSrc,Songs song) {
		super(name, imgSrc);
		// TODO Auto-generated constructor stub
		this.artist = song.getArtist();
	}
	
	public String getArtistName(){
		return this.artist.getName();
	}
}

package mPlayer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ObjectSelector {
	BufferedImage image;
	private String name;
	
	public ObjectSelector(String name,String imgSrc){
		File img = new File(imgSrc);
		try {
			this.image = ImageIO.read(img);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.name = name;
	}
}

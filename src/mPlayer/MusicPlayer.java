package mPlayer;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.*;

public class MusicPlayer extends JFrame {
	private JFrame frame;
	private JPanel pages;
	private JLabel controlsLabel;
	
	public static void main(String[] args)	{
		new MusicPlayer();
		
	}
	
	public MusicPlayer(){
		prepare();
	}
	
	private void prepare(){
		frame = new JFrame("Music Player");
		frame.setSize(800,800);
		frame.setLayout(new GridLayout(2, 1, 0, 10));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pages = new JPanel();
		pages.setLayout(new FlowLayout());
	}
	
}

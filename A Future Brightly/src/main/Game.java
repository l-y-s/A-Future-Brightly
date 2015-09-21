package main;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Game{
	
	public static void main(String[] args){
		JFrame window = new JFrame("A Future Brightly");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		
		try{
			window.setIconImage(ImageIO.read(new File("Resources/Backgrounds/[TBD]")));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		window.setVisible(true);
	}
}
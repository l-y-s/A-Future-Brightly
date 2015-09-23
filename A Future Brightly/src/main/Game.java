package main;

//Allows for manipulation of files
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;	//Allows for image IO for backgrounds and icons
import javax.swing.JFrame; //Allows for creation of JFrame
import javax.swing.JScrollPane;

public class Game{
	
	public static void main(String[] args){
		JFrame window = new JFrame("A Future Brightly");
		GamePanel textPanel = new GamePanel();
		textPanel.setEditable(false);
		JScrollPane scroll = new JScrollPane(textPanel);
		window.setContentPane(scroll);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		
		try{
			window.setIconImage(ImageIO.read(new File("Resources/Icons/Heart Icon.png")));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		window.setVisible(true);
	}
}
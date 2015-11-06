package main;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame; //Allows for creation of JFrame
import javax.swing.JScrollPane;

public class Game{
	
	public static void main(String[] args){
		JFrame window = new JFrame("A Future Brightly"); //Creates new JFrame
		URL iconURL = Game.class.getResource("/Icons/Heart.png");
		
		//Creates new GamePanel sets properties
		GamePanel textPanel = new GamePanel();
		textPanel.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(textPanel); //Creates new JScrollPane to allow GamePanel to scroll
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		//Set JFrame properties
		window.setContentPane(scroll);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		
		//Sets window icon
		try{
			ImageIcon icon = new ImageIcon(iconURL);
			window.setIconImage(icon.getImage());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		window.setVisible(true); //Makes window visible
	}
}
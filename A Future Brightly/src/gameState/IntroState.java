package gameState;

import gameState.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class IntroState extends GameState {
	
	//Construct IntroState
	public IntroState(GameStateManager gsm) {
		this.gsm = gsm; //Stores reference to gsm
		this.backgroundLoc = "Resources/Backgrounds/Blue Background.jpg"; //Stores background location
		this.textLoc = "Resources/Game State Texts/Intro.txt";
		try {
			gsm.getGP().setBG(backgroundLoc); //Set background of GamePanel to current state background
			init();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void init() {
		try {
			this.br = new BufferedReader(new FileReader(textLoc));
		} catch(Exception e){
			e.printStackTrace();
		}
		gsm.getGP().append("Test text\n");
		gsm.getGP().append("More test text\n");
	}
	
	//Keylisteners
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:		//Reads and prints next line from text file until EOF
			try {
				String line = br.readLine();
				if (line != null) {
					line = line + "\n";
					gsm.getGP().append(line);
				}
				else {
					br.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case KeyEvent.VK_Y: 		//Temporary keypress, currently used to test string appending
			//Placeholder
			gsm.getGP().append("This will appear if it works.\n");
			break;
		}
	}
	
	//Does nothing
	public void keyReleased(int k) {}
}
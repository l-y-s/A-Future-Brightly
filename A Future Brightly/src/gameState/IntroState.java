package gameState;

import gameState.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class IntroState extends GameState {
	
	//Construct IntroState
	public IntroState(GameStateManager gsm) {
		this.gsm = gsm; //Stores reference to gsm
		this.background = "Resources/Backgrounds/Blue Background.jpg"; //Stores background location
		try {
			gsm.getGP().setBG(background); //Set background of GamePanel to current state background
			init();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void init() {
		gsm.getGP().append("Test text\n");
		gsm.getGP().append("More test text\n");
	}
	
	//Keylisteners
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:		//Reads and prints next line from text file until EOF
			//Placeholder
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
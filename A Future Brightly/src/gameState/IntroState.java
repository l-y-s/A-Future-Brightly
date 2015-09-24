package gameState;

import gameState.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IntroState extends GameState {
	
	//Construct IntroState
	public IntroState(GameStateManager gsm) {
		this.gsm = gsm; //Stores reference to gsm
		this.backgroundLoc = getClass().getResource("/Backgrounds/Intro.jpg"); //Stores background location from URL of image
		this.textLoc = getClass().getResource("/Game State Texts/Intro.txt"); //Stores text location from URL of file
		init();
	}
	
	public void init() {
		try {
			gsm.getGP().setBG(backgroundLoc); //Set background of GamePanel to current state background
			this.br = new BufferedReader(new InputStreamReader(textLoc.openStream())); //Creates Buffered Reader from text file
		} catch(Exception e){
			e.printStackTrace();
		}
		gsm.getGP().append("Welcome to \"A Future Brightly\", an Interactive Fiction game produced by Logan Schmidt\n(press enter to scroll through text).\n");
	}
	
	//Keylisteners
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:		//Reads and prints next line from text file until EOF
			
			outputLines(br);
			break;
			
		case KeyEvent.VK_Y: 		//Temporary keypress, currently used to test string appending
			//Placeholder
			gsm.setState(GameStateManager.HIGHSCHOOL);
			break;
		}
	}
	
	//Does nothing
	public void keyReleased(int k) {}
}
package gameState;

import gameState.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class HighSchoolState extends GameState {
	
	//Construct HighSchoolState
	public HighSchoolState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Green Background.jpg");
		this.textLoc = getClass().getResource("/Game State Texts/Intro.txt");
	}
	
	public void init() {
		try {
			clearPanel();
			gsm.getGP().setBG(backgroundLoc);
			this.br = new BufferedReader(new InputStreamReader(textLoc.openStream()));
		} catch(Exception e){
			e.printStackTrace();
		}
		gsm.getGP().append("This is the HighSchoolState.\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);
			break;
			
		case KeyEvent.VK_Y:
			System.exit(0);
		}
	}
	
	public void keyReleased(int k) {}
}
package gameState;

import gameState.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class IntroState extends GameState {
	private String out = null;
	
	public IntroState(GameStateManager gsm) {
		this.gsm = gsm;
		try {
			init();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void init() {
		gsm.getGP().append("Test text\n");
		gsm.getGP().append("More test text\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			//Placeholder to print text until EOF
			break;
		case KeyEvent.VK_Y:
			//Placeholder
			break;
		}
	}
	
	public void keyReleased(int k) {}
}
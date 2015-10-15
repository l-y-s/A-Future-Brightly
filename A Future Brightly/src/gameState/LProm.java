package gameState;

import java.awt.event.KeyEvent;


public class LProm extends GameState {
	
	//Construct State, sets resource locations
	public LProm(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Prom.png");
		this.textLoc = getClass().getResource("/Texts/LProm.txt");
	}
	
	//Initializes the state
	public void init() {

		super.init();	//Calls superclass initializer. 
		gsm.getGP().append("Test");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br); //Read in a line and append to GamePanel
			break;
		
		case KeyEvent.VK_ESCAPE:
			exitConfirm();	//Open confirmation dialog on close
		}
	}
	
	public void keyReleased(int k) {}
}

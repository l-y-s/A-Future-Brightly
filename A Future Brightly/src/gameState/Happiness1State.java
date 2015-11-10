package gameState;

import java.awt.event.KeyEvent;

public class Happiness1State extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public Happiness1State(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("TBD");
		this.textLoc = getClass().getResource("TBD");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("TBD");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);
			break;
			
		case KeyEvent.VK_ESCAPE:
			exitConfirm();
		}
	}
	
	public void keyReleased(int k) {}
	
}
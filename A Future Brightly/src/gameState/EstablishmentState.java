package gameState;

import java.awt.event.KeyEvent;

public class EstablishmentState extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public EstablishmentState(GameStateManager gsm) {
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
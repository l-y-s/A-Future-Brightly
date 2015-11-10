package gameState;

import java.awt.event.KeyEvent;

public class Happiness2State extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public Happiness2State(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Happiness.jpg");
		this.textLoc = getClass().getResource("/Texts/Happiness2.txt");
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
			
		case KeyEvent.VK_O:
			gsm.setState(GameStateManager.OUTRO);
			break;
		}
	}
	
	public void keyReleased(int k) {}
	
}
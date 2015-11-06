package gameState;

import java.awt.event.KeyEvent;

public class MarriageState extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public MarriageState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Marriage.jpg");
		this.textLoc = getClass().getResource("/Texts/Marriage.txt");
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
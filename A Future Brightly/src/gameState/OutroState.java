package gameState;

import java.awt.event.KeyEvent;

public class OutroState extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public OutroState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Outro.jpg");
		this.textLoc = getClass().getResource("/Texts/Outro.txt");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("And that's the end of it :)");
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
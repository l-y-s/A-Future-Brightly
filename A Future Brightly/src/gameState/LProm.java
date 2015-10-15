package gameState;

import java.awt.event.KeyEvent;


public class LProm extends GameState {
	
	//Construct State, sets resource locations
	public LProm(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Prom.png");
		this.textLoc = getClass().getResource("/Texts/LProm.txt");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("Well, the big night is here.");
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
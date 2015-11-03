package gameState;

import java.awt.event.KeyEvent;

public class CollegeState extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public CollegeState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/College.png");
		this.textLoc = getClass().getResource("/Texts/College.txt");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("Finally, you've made it to college.");
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
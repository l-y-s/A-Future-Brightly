package gameState;

import java.awt.event.KeyEvent;

public class BreakupState extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public BreakupState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Breakup.png");
		this.textLoc = getClass().getResource("/Texts/Breakup.txt");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("Sometimes things don't work out.\n\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);
			break;
			
		case KeyEvent.VK_ESCAPE:
			exitConfirm();
			
		case KeyEvent.VK_E:
			if(choiceTime == true) {
				gsm.setState(GameStateManager.OUTRO);
				break;
			} else {break;}
		}
	}
	
	public void keyReleased(int k) {}
	
}
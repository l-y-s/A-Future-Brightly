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
		gsm.getGP().append("The sun begins descending, casting long shadows over the yard.\n\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);
			break;
			
		case KeyEvent.VK_ESCAPE:
			exitConfirm();
			
		case KeyEvent.VK_O:
			if(choiceTime == true) {
				gsm.setState(GameStateManager.OUTRO);
				break;
			} else{break;}
		}
	}
	
	public void keyReleased(int k) {}
	
}
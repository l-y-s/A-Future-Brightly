package gameState;

import java.awt.event.KeyEvent;

public class MajorEventsState extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public MajorEventsState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/MajorEvents.jpg");
		this.textLoc = getClass().getResource("/Texts/MajorEvents.txt");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("Life flies by now.\n\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);
			break;
			
		case KeyEvent.VK_ESCAPE:
			exitConfirm();
			
		case KeyEvent.VK_H:
			if (choiceTime == true){
				gsm.setState(GameStateManager.HAPPINESS2);
				break;
			} else {break;}
		}
	}
	
	public void keyReleased(int k) {}
	
}
package gameState;

import java.awt.event.KeyEvent;

public class KidsState extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public KidsState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Kids.jpg");
		this.textLoc = getClass().getResource("/Texts/Kids.txt");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("You hear the loud cries and finally the pain subsides.\n\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);
			break;
			
		case KeyEvent.VK_ESCAPE:
			exitConfirm();
			
		case KeyEvent.VK_L:
			//if (choiceTime == true){
			gsm.setState(GameStateManager.MAJOREVENTS);
			break;
		//} else {break;}
		}
	}
	
	public void keyReleased(int k) {}
	
}
package gameState;

import java.awt.event.KeyEvent;

public class EstablishmentState extends GameState {
	
	//Constructs BreakupState, sets resource locations
	public EstablishmentState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Establishment.png");
		this.textLoc = getClass().getResource("/Texts/Establishment.txt");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("You throw open the door, worn out.\n\n");
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
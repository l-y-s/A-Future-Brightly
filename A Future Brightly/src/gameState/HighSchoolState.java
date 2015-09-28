package gameState;

import java.awt.event.KeyEvent;

public class HighSchoolState extends GameState {
	
	//Construct HighSchoolState, sets resource locations
	public HighSchoolState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/HighSchool.jpg");
		this.textLoc = getClass().getResource("/Texts/HighSchool.txt");
	}
	
	//Initializes the state and sets the first line on the GamePanel
	public void init() {
		super.init();	//Calls superclass initializer
		gsm.getGP().append("The doors open. It\'s uncharacteristicly quiet, despite it being the library.\n\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);	//Read in one line and append to GamePanel
			break;
			
		case KeyEvent.VK_ESCAPE:
			exitConfirm();		//Open confirmation dialog on close
		
		case KeyEvent.VK_T:
			gsm.setState(GameStateManager.TPROM);	//Change to TProm state
			break;
		
		case KeyEvent.VK_L:
			gsm.setState(GameStateManager.LPROM);	//Change to LProm state
			break;
		}
	}
	
	public void keyReleased(int k) {}
}
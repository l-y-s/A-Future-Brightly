package gameState;

import java.awt.event.KeyEvent;

public class SummerState extends GameState {
	
	//Constructs State, sets resource locations
	public SummerState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Summer.jpg");
		this.textLoc = getClass().getResource("/Texts/Summer.txt");
	}
	
	//Initializes the state
	public void init() {
		super.init();	//Calls superclass initializer
		gsm.getGP().append("The rest of the school year flew by.\n\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);	//Read in a line and append to GamePanel
			break;
			
		case KeyEvent.VK_ESCAPE:
			exitConfirm();		//Open confirmation dialog on close
		}
	}
	
	public void keyReleased(int k) {}
}
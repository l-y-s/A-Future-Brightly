package gameState;

import java.awt.event.KeyEvent;

public class TPromState extends GameState {
	
	//Construct State, sets resource locations
	public TPromState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Prom.png");
		this.textLoc = getClass().getResource("/Texts/TProm.txt");
	}
	
	//Initializes the state
	public void init() {
		super.init();	//Calls superclass initializer
		gsm.getGP().append("Well, the big night is here.\n\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);	//Read in a line and append to GamePanel
			break;
		
		case KeyEvent.VK_ESCAPE:
			exitConfirm();		//Open confirmation dialog on close
		
		case KeyEvent.VK_C:
			if(this.choiceTime == true) {
				gsm.setState(GameStateManager.SUMMER);
				break;
			} else {break;}
		}
		
			
	}
	
	public void keyReleased(int k) {}
}

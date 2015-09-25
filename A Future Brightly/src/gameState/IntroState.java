package gameState;


import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IntroState extends GameState {
	
	//Construct IntroState
	public IntroState(GameStateManager gsm) {
		this.gsm = gsm; //Stores reference to gsm
		this.backgroundLoc = getClass().getResource("/Backgrounds/Intro.jpg"); //Stores background location from URL of image
		this.textLoc = getClass().getResource("/Texts/Intro.txt"); //Stores text location from URL of file
		init();
	}
	
	public void init() {
		try {
			gsm.getGP().setBG(backgroundLoc); //Set background of GamePanel to current state background
			this.br = new BufferedReader(new InputStreamReader(textLoc.openStream())); //Creates Buffered Reader from text file
		} catch(Exception e){
			e.printStackTrace();
		}
		gsm.getGP().append("Hi sweet girl :) This is what I've been working on for the last few weeks.\n"
				+ "This is an Interactive Fiction game I decided to call A Future Brightly.\n"
				+ "It won't play out like a normal game, but I still hope you like it.\n"
				+ "From here, press ENTER to proceed through the text.\n\n");
	}
	
	//Keylisteners
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:		//Reads and prints next line from text file until EOF
			
			outputLines(br);
			break;
			
		case KeyEvent.VK_Y: 		//Temporary keypress, currently used to test string appending
			//Placeholder
			gsm.setState(GameStateManager.HIGHSCHOOL);
			break;
		}
	}
	
	//Does nothing
	public void keyReleased(int k) {}
}
package gameState;


import java.awt.event.KeyEvent;

public class IntroState extends GameState {
	
	//Construct IntroState
	public IntroState(GameStateManager gsm) {
		this.gsm = gsm; //Stores reference to gsm
		this.backgroundLoc = getClass().getResource("/Backgrounds/Intro.jpg"); //Stores background location from URL of image
		this.textLoc = getClass().getResource("/Texts/Intro.txt"); //Stores text location from URL of file
		init();
	}
	
	//Initializes background and BufferedReader
	public void init() {
		super.init();
		
		//Intro text displayed on initialization
		gsm.getGP().append("Hi sweet girl :) This is what I've been working on for the last few weeks.\n\n"
				+ "This is an Interactive Fiction game I decided to call A Future Brightly.\n\n"
				+ "It won't play out like a normal game, but I still hope you like it.\n\n"
				+ "From here, press ENTER to proceed through the text.\n\n\n\n");
	}
	
	//Keylisteners
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:		//Reads and prints next line from text file until EOF
			
			outputLines(br);
			break;
			
		case KeyEvent.VK_Y: 		//Starts the HighSchool GameState
			if(this.choiceTime == true) {
				gsm.setState(GameStateManager.HIGHSCHOOL);
				break;
			} else {break;}
			
		case KeyEvent.VK_ESCAPE:
			exitConfirm();
		}
	}
	
	//Does nothing
	public void keyReleased(int k) {}
}
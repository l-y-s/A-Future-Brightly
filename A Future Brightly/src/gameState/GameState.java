package gameState;

import java.io.BufferedReader;
import java.net.URL;

//Abstract GameState
public abstract class GameState {

	
	protected GameStateManager gsm; //Reference to gsm to access GamePanel references and change current GameState
	
	protected URL backgroundLoc; //Stores location of GameState background
	protected URL textLoc; //Stores location of GameState text file
	protected BufferedReader br; 
	
	public abstract void init();
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
	
}

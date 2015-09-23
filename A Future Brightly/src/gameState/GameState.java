package gameState;

import java.io.BufferedReader;

//Abstract GameState
public abstract class GameState {

	
	protected GameStateManager gsm; //Reference to gsm to access GamePanel references and change current GameState
	
	protected String background; //Stores location of GameState background
	
	public abstract void init();
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
	
}

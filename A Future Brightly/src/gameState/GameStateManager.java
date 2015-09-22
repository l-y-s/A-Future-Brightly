package gameState;

import java.util.ArrayList;

import main.GamePanel;

public class GameStateManager{
	private ArrayList<GameState> gameStates;
	private int currentState;
	private GamePanel gp; 
	
	public static final int INTROSTATE = 0;
	
	public GameStateManager(GamePanel textPanel){
		gp = textPanel;
		gameStates = new ArrayList<GameState>();
		currentState = INTROSTATE;
		
		gameStates.add(new IntroState(this)); //0
	}
	
	public void setState(int state){
		currentState = state;
		gameStates.get(currentState).init();
	}
	
	public int getState(){
		return this.currentState;
	}
	
	public GamePanel getGP() {
		return this.gp;
	}
	
	public void keyReleased(int k) {
		gameStates.get(currentState).keyReleased(k);
	}
	
	public void keyPressed(int k) {
		gameStates.get(currentState).keyPressed(k);
	}
}
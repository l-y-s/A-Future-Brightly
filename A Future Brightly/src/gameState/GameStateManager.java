package gameState;

import java.util.ArrayList;

import main.GamePanel;

public class GameStateManager{
	private ArrayList<GameState> gameStates; //Array to store each GameState instance
	private int currentState; //Integer to store current GameState
	private GamePanel gp; //Contains reference to GamePanel for outputting text
	
	//Static int references for each GameState
	public static final int INTROSTATE = 0;
	public static final int HIGHSCHOOL = 1;
	public static final int TPROM = 2;
	public static final int LPROM = 3;
	
	//Construct GameStateManager
	public GameStateManager(GamePanel textPanel){
		gp = textPanel;
		gameStates = new ArrayList<GameState>();
		currentState = INTROSTATE;
		
		//Instantiate each GameState on creation (may need to changed to handle dynamic creation due to branching)
		gameStates.add(new IntroState(this)); //0
		gameStates.add(new HighSchoolState(this)); //1
		gameStates.add(new TProm(this)); //2
		gameStates.add(new LProm(this)); //3
	}
	
	//Setter for changing GameStates
	public void setState(int state){
		currentState = state;
		gameStates.get(currentState).init();
	}
	
	//Getter for current GameState
	public int getState(){
		return this.currentState;
	}
	
	//Getter for GamePanel to allow string output
	public GamePanel getGP() {
		return this.gp;
	}
	
	//Keylisteners
	public void keyReleased(int k) {
		gameStates.get(currentState).keyReleased(k);
	}
	
	public void keyPressed(int k) {
		gameStates.get(currentState).keyPressed(k);
	}
}
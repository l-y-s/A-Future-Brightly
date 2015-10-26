package gameState;

import java.util.ArrayList;

import main.GamePanel;

public class GameStateManager{
	private ArrayList<GameState> gameStates; //Array to store each GameState instance
	private int currentState; //Integer to store current GameState
	private GamePanel gp; //Contains reference to GamePanel for outputting text
	
	//Static int references for each GameState
	public static final int INTRO = 0;
	public static final int HIGHSCHOOL = 1;
	public static final int TPROM = 2;
	public static final int LPROM = 3;
	public static final int SUMMER = 4;
	public static final int COLLEGE = 5;
	public static final int BREAKUP = 6;
	public static final int ESTABLISHMENT = 7;
	public static final int MARRIAGE = 8;
	public static final int KIDS = 9;
	public static final int MAJOREVENTS = 10;
	public static final int HAPPINESS = 11;
	public static final int OUTRO = 12;
	
	//Construct GameStateManager
	public GameStateManager(GamePanel textPanel){
		gp = textPanel;
		gameStates = new ArrayList<GameState>();
		currentState = INTRO;
		
		//Instantiate each GameState on creation (may need to changed to handle dynamic creation due to branching)
		gameStates.add(new IntroState(this)); //0
		gameStates.add(new HighSchoolState(this)); //1
		gameStates.add(new TPromState(this)); //2
		gameStates.add(new LPromState(this)); //3
		gameStates.add(new SummerState(this)); //4
		gameStates.add(new CollegeState(this));
		gameStates.add(new BreakupState(this));
		gameStates.add(new EstablishmentState(this));
		gameStates.add(new MarriageState(this));
		gameStates.add(new KidsState(this));
		gameStates.add(new MajorEventsState(this));
		gameStates.add(new HappinessState(this));
		gameStates.add(new OutroState(this));
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
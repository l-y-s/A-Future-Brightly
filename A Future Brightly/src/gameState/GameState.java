package gameState;

//Abstract GameState
public abstract class GameState {

	protected GameStateManager gsm;
	
	protected String background;
	protected String output = null;
	
	public abstract void init();
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
	
}

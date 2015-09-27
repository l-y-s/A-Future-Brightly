package gameState;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class HighSchoolState extends GameState {
	
	//Construct HighSchoolState, sets resource locations
	public HighSchoolState(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/HighSchool.jpg");
		this.textLoc = getClass().getResource("/Texts/HighSchool.txt");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("The doors open. It\'s uncharacteristicly quiet, despite it being the library.\n\n");
	}
	
	public void keyPressed(int k) {
		switch(k) {
		
		case KeyEvent.VK_ENTER:
			outputLines(br);
			break;
			
		case KeyEvent.VK_ESCAPE:
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Really quit?", "Warning", dialogButton);
			if (dialogResult == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		
		case KeyEvent.VK_T:
			gsm.setState(GameStateManager.TPROM);
			break;
		
		case KeyEvent.VK_L:
			gsm.setState(GameStateManager.LPROM);
			break;
		}
	}
	
	public void keyReleased(int k) {}
}
package gameState;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class TProm extends GameState {
	
	//Construct State, sets resource locations
	public TProm(GameStateManager gsm) {
		this.gsm = gsm;
		this.backgroundLoc = getClass().getResource("/Backgrounds/Prom.jpg");
		this.textLoc = getClass().getResource("/Texts/TProm.txt");
	}
	
	public void init() {
		super.init();
		gsm.getGP().append("Test");
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
		}
	}
	
	public void keyReleased(int k) {}
}
package gameState;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;

//Abstract GameState
public abstract class GameState {

	
	protected GameStateManager gsm; //Reference to gsm to access GamePanel references and change current GameState
	
	protected URL backgroundLoc; //Stores location of GameState background
	protected URL textLoc; //Stores location of GameState text file
	protected BufferedReader br; 
	
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
	
	public void outputLines(BufferedReader br) {
		try {
			String line = br.readLine();
			if (line != null) {
				line = line + "\n\n";
				gsm.getGP().append(line);
			}
			else {
				br.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clearPanel() {
		gsm.getGP().setDocument(new PlainDocument());
	}
	
	public void init() {
		try {
			clearPanel();
			gsm.getGP().setBG(backgroundLoc);
			this.br = new BufferedReader(new InputStreamReader(textLoc.openStream()));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void exitConfirm() {
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(null, "Really quit?", "Warning", dialogButton);
		if (dialogResult == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}

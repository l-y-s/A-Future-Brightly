package main;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import gameState.GameStateManager;

public class GamePanel extends JEditorPane implements KeyListener {
	
	//Static window dimensions
	public static final int WIDTH = 425;
	public static final int HEIGHT = 300;
	public static final int SCALE = 2;
	
	private URL background; //Stores background location
	
	private GameStateManager gsm; //Stores gsm reference
	
	public GamePanel() {
		//Create and set properties for GamePanel
		super();
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setOpaque(false);
		setFocusable(true);
		requestFocus();
		init();
	}
	
	//Repaints GamePanel to add background image
	protected void paintComponent(Graphics g) {
		BufferedImage image = null;
		try{
			image = ImageIO.read(background); //Read image into buffer
			g.drawImage(image, 0, 0, (int) getSize().getWidth(), (int) getSize().getHeight(), this); //Draw background to fit GamePanel
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.paintComponent(g);
	}
	
	//Setter for background image, called by individual GameStates
	public void setBG(URL loc) {
		background = loc;
		Graphics2D g = (Graphics2D) this.getGraphics(); //Creates Graphics2D object of current window graphics
		this.paint(g); //Repaints the window (not supposed to be called directly, but still works)
	}
	
	//Appends string to the GamePanel
	public void append(String s) {
		try{
			Document doc = this.getDocument(); //Creates Document object of current text in GamePanel
			doc.insertString(doc.getLength(),  s, null); //Inserts string at end of document
			this.setCaretPosition(doc.getLength()); //Auto-scrolls GamePanel by setting caret position to bottom
		} catch(BadLocationException exc) {
			exc.printStackTrace();
		}
	}
	
	public void init() {
		gsm = new GameStateManager(this);
	}
	
	//Adds keylisteners to GamePanel, honestly not sure how
	public void addNotify() {
		super.addNotify();
			addKeyListener(this);
	}
	
	//Keylisteners
	public void keyTyped(KeyEvent key){
	}
	
	public void keyPressed(KeyEvent key){
		key.consume();
		gsm.keyPressed(key.getKeyCode());
	}
	
	public void keyReleased(KeyEvent key) {
		gsm.keyReleased(key.getKeyCode());
	}
}
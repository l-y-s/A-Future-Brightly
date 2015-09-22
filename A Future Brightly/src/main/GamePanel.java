package main;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import gameState.GameStateManager;

public class GamePanel extends JEditorPane implements KeyListener {
	public static final int WIDTH = 425;
	public static final int HEIGHT = 300;
	public static final int SCALE = 2;
	
	private GameStateManager gsm;
	
	public GamePanel() {
		super();
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setOpaque(false);
		setFocusable(true);
		requestFocus();
		init();
	}
	
	protected void paintComponent(Graphics g) {
		BufferedImage image = null;
		try{
			image = ImageIO.read(new File("Resources/Backgrounds/Blue Background.jpg"));
			g.drawImage(image, 0, 0, (int) getSize().getWidth(), (int) getSize().getHeight(), this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.paintComponent(g);
	}
	
	public void append(String s) {
		try{
			Document doc = this.getDocument();
			doc.insertString(doc.getLength(),  s, null);
		} catch(BadLocationException exc) {
			exc.printStackTrace();
		}
	}
	
	public void init() {
		gsm = new GameStateManager(this);
	}
	
	public void addNotify() {
		super.addNotify();
			addKeyListener(this);
	}
	
	public void keyTyped(KeyEvent key){
	}
	
	public void keyPressed(KeyEvent key){
		gsm.keyPressed(key.getKeyCode());
	}
	
	public void keyReleased(KeyEvent key) {
		gsm.keyReleased(key.getKeyCode());
	}
}
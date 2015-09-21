package main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

import javax.swing.JPanel;

import gameState.GameStateManager;

public class GamePanel extends JPanel implements Runnable, KeyListener {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	public static final int SCALE = 2;
	
	private Thread thread;
	private boolean running = false;
	
	private GameStateManager gsm;
	
	public GamePanel() {
		super();
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setFocusable(true);
		requestFocus();
	}
	
	public void addNotify() {
		super.addNotify();
		if (thread == null) {
			thread = new Thread(this);
			addKeyListener(this);
			thread.start();
		}
	}
	
	public void init() {
		running = true;
		gsm = new GameStateManager();
	}
	
	public void run() {
		init();
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
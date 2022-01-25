package io.github.ytboy.jupiter;

import org.lwjgl.opengl.Display;

public class Client {
	/*
	 * Main class for Jupiter.java to extend
	 */
	
	/* client name*/
	String NAME;
	/*client version*/
	String VERSION;
	/*constructor*/
	public Client(String name, String version) {
		this.NAME = "Jupiter Continued";
		this.VERSION = 1.0.0;
		start();
		Display.setTitle(name + " " + "v" + version);
	}
	/*starting method*/
	public void start() {}
}

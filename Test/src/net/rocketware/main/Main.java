package net.rocketware.main;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Main {
	public static int WIDTH = 640;
	public static int HEIGHT = 480;
	public static void main(String[] args){
		System.out.println("Class of Empires started...");
		JFrame f = new JFrame("Class of Empires");
		UserInterface ui = new UserInterface();
		f.add(ui);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(WIDTH, HEIGHT);
		f.setVisible(true);
	}
}

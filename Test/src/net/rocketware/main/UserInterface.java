package net.rocketware.main;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class UserInterface extends JPanel implements MouseListener, MouseMotionListener {
	public static int x = 0;
	public static int y = 0;
	public void paintComponent(Graphics g){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.setColor(Color.RED);
		g.drawOval(x-10,y-10,20,20);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
}

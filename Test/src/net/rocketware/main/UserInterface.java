package net.rocketware.main;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

import net.rocketware.main.UnitDebug;

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
		g.setColor(Color.BLUE);
		UnitDebug.MoveUnit(x, y);
		g.fillOval(UnitDebug.currentX+5, UnitDebug.currentY+5, 10, 10);
		g.drawString("debug", UnitDebug.currentX+5, UnitDebug.currentY+5);
		g.setColor(Color.RED);
		g.fillRect(UnitDebug.currentX+5, UnitDebug.currentY+20, 20, 4);
		g.setColor(Color.GREEN);
		g.fillRect(UnitDebug.currentX+5, UnitDebug.currentY+20, UnitDebug.HP*2, 4);
		g.setColor(Color.BLUE);
		g.drawString("HP: "+UnitDebug.HP, UnitDebug.currentX+5, UnitDebug.currentY+35);
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
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

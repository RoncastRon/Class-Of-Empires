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
		g.drawRect(1, 1, 50, 30);
		g.drawRect(50, 1, 50, 30);
		g.drawString(UnitDebug.UnitNames[1], 20, 15);
		g.drawString(UnitDebug.UnitNames[0], 70, 15);
		for(int i = 0; i<UnitDebug.UnitCount; i++){
			if(UnitDebug.UnitTeams[i] == 1){
				g.setColor(Color.RED);
				g.fillOval(UnitDebug.UnitX[i]+5, UnitDebug.UnitY[i]+5, 10, 10);
				g.drawString(UnitDebug.UnitNames[i], UnitDebug.UnitX[i]+5, UnitDebug.UnitY[i]+5);
			}
			if(UnitDebug.UnitTeams[i] == 0){
				g.setColor(Color.BLUE);
				g.fillOval(UnitDebug.UnitX[i]+5, UnitDebug.UnitY[i]+5, 10, 10);
				g.drawString(UnitDebug.UnitNames[i], UnitDebug.UnitX[i]+5, UnitDebug.UnitY[i]+5);
			}
			g.setColor(Color.RED);
			g.fillRect(UnitDebug.UnitX[i]+5, UnitDebug.UnitY[i]+20, 20, 4);
			g.setColor(Color.GREEN);
			g.fillRect(UnitDebug.UnitX[i]+5, UnitDebug.UnitY[i]+20, UnitDebug.HP[i]*2, 4);
			if(UnitDebug.UnitTeams[i] == 1){
				g.setColor(Color.RED);
				g.drawString("HP: "+UnitDebug.HP[i], UnitDebug.UnitX[i]+5, UnitDebug.UnitY[i]+35);
			}
			if(UnitDebug.UnitTeams[i] == 0){
				g.setColor(Color.BLUE);
				g.drawString("HP: "+UnitDebug.HP[i], UnitDebug.UnitX[i]+5, UnitDebug.UnitY[i]+35);
			}
		}
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
		int x2 = e.getX();
		int y2 = e.getY();
		if(y2>0&&y2<30&&x2>0&&x2<50){
			UnitDebug.SelectedUnit=1;
		}
		if(y2>0&&y2<30&&x2>50&&x2<100){
			UnitDebug.SelectedUnit=0;
		}
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

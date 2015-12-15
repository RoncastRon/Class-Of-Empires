package net.rocketware.main;
import net.rocketware.main.UserInterface;

public class UnitDebug{
	static int targetX = 0;
	static int targetY = 0;
	static int currentY = 0;
	static int currentX = 0;
	
	public void loop(){
		targetX = UserInterface.x;
		targetY = UserInterface.y;
	}
}

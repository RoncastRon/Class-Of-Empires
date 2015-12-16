package net.rocketware.main;
import net.rocketware.main.UserInterface;

public class UnitDebug{
	static int targetX = 0;
	static int targetY = 0;
	static int currentY = 0;
	static int currentX = 0;
	static int vertical = -1; //-1 = down, 1 = up
	static int horizontal = -1; //-1 = left, 1 = right
	static int HP = 10;
	
	public static void MoveUnit(int x, int y){
		targetX = x-10;
		targetY = y-10;
		if(currentY > targetY){
			vertical = 1;
		}
		if(currentY < targetY){
			vertical = -1;
		}
		if(currentY == targetY){
			vertical = 0;
		}
		if(currentX > targetX){
			horizontal = -1;
		}
		if(currentX < targetX){
			horizontal = 1;
		}
		if(currentX == targetX){
			horizontal = 0;
		}
		if(horizontal == 1){
			currentX = currentX + 1;
		}
		if(horizontal == -1){
			currentX = currentX - 1;
		}
		if(vertical == 1){
			currentY = currentY - 1;
		}
		if(vertical == -1){
			currentY = currentY + 1;
		}
	}
}

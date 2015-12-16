package net.rocketware.main;
import net.rocketware.main.UserInterface;

public class UnitDebug{
	static int targetX = 0;
	static int targetY = 0;
	static int currentY = 0;
	static int currentX = 0;
	static int vertical = -1; //-1 = down, 1 = up
	static int horizontal = -1; //-1 = left, 1 = right
	static int HP[] = {10, 10, 10};
	static int unitID = 0;
	static int UnitCount = 3;
	static int UnitX[] = {0, 10, 50};
	static int UnitY[] = {0, 10, 80};
	static String UnitNames[] = {"Unit1", "Unit2", "FireDummy"};
	static int UnitIDs[] = {1, 2, 3};
	static int UnitTeams[] = {0, 0, 1};
	static int SelectedUnit = 0;
	
	public static void MoveUnit(int x, int y){
		targetX = x-10;
		targetY = y-10;
		if(UnitY[SelectedUnit] > targetY){
			vertical = 1;
		}
		if(UnitY[SelectedUnit] < targetY){
			vertical = -1;
		}
		if(UnitY[SelectedUnit] == targetY){
			vertical = 0;
		}
		if(UnitX[SelectedUnit] > targetX){
			horizontal = -1;
		}
		if(UnitX[SelectedUnit]< targetX){
			horizontal = 1;
		}
		if(UnitX[SelectedUnit]== targetX){
			horizontal = 0;
		}
		if(horizontal == 1){
			UnitX[SelectedUnit] = UnitX[SelectedUnit] + 1;
		}
		if(horizontal == -1){
			UnitX[SelectedUnit] = UnitX[SelectedUnit] - 1;
		}
		if(vertical == 1){
			UnitY[SelectedUnit] = UnitY[SelectedUnit] - 1;
		}
		if(vertical == -1){
			UnitY[SelectedUnit] = UnitY[SelectedUnit] + 1;
		}
		
	}
}

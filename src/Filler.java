//Alexander Lemkin
//COP 3330 MWF 2:30 pm - 3:20 pm
//Adventure game moving characters on a gui

import java.lang.*;

public class Filler extends Character{

	public Filler(Cave initLoc) {
		super(initLoc);
		location = initLoc;
		location.setOccupied(true);
	}
	//Attempting to modify the cave
	public boolean modifyCave(Cave loc) {
		Cave tempCave = loc;
		if (tempCave.isPit() == false)
			return false;
		else {
			tempCave.makeOpen();
			return true;
			}
		}
	
	public String describeModification() {
		String tempStr;
		tempStr = "filled in this pit!";
		return tempStr; 
	}
	//Attempting to move the Filler and calling the super class if it is valid
	public boolean move(Cave to) {
		boolean tempBool;
		if (to.isOccupied() == false && to.isBlocked() == false)
			return tempBool = super.move(to);
		else
			return false; 
	}
	//Name
	public String getName() {
		String tempString = "The Protector";
		return tempString;
	}
	
}

//Alexander Lemkin
//COP 3330 MWF 2:30 pm - 3:20 pm
//Adventure game moving characters on a gui

import java.lang.*;

public class Adventurer extends Character{
	
	public Adventurer(Cave initLoc) {
		super(initLoc);
		location = initLoc;
		location.setOccupied(true);
	}
	//Attempting to modify the cave
	public boolean modifyCave(Cave loc) {
		Cave tempCave = loc; 
		if (tempCave.isTeleport() == false)
			return false;
		else {
			tempCave.setMarked(true);
			return true;
		}
	}
	
	public String describeModification() {
		String tempStr;
		tempStr = "marked this location as a portal!";
		return tempStr; 
		
	}
	//Attempting to move the Adventurer and calling the super class if it is valid
	public boolean move(Cave to) {
		boolean tempBool;
		if (to.isOccupied() == false && to.isBlocked() == false)
			return tempBool = super.move(to);
		else
			return false; 
	}
	//Name: Modify if you want to get creative
	public String getName() {
		String tempString = "Alexandra the Great";
		return tempString;
	}
	
}

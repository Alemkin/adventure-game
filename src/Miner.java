//Alexander Lemkin
//COP 3330 MWF 2:30 pm - 3:20 pm
//Adventure game moving characters on a gui

import java.lang.*;

public class Miner extends Character{

	public Miner(Cave initLoc) {
		super(initLoc);
		location = initLoc;
		location.setOccupied(true);
	}
	//Attempting to modify the cave
	public boolean modifyCave(Cave loc) {
		Cave tempCave = loc;
		if (tempCave.isBlocked() == false) {
			return false;
		}
		else {
			tempCave.makeOpen();
			
			if(tempCave.isDragon()){
				tempCave.setMarked(true);
			}
			return true;
			
		}
	}
	
	public String describeModification() {
		String tempStr;
		tempStr = "unblocked this cave!";
		return tempStr; 
	}
	//Attempting to move the Miner and calling the super class if it is valid
	public boolean move(Cave to) {
		boolean tempBool;
		if (to.isOccupied() == false)
			return tempBool = super.move(to);
		else
			return false; 
	}
	//Name: Modify if you want to get creative
	public String getName() {
		String tempString = "The Savior";
		return tempString;
	}
	
}

//Alexander Lemkin
//COP 3330 MWF 2:30 pm - 3:20 pm
//Adventure game moving characters on a gui

import java.lang.*;

public abstract class Character implements CaveWorker{

	protected Cave location;
	
	public Character(Cave initLoc) {
		location = initLoc; 
	}
	
	public Cave getLocation() {
		return location; 
	}
	//Super class method moving the character if called by sub class
	public boolean move(Cave to) {
		Cave tempLocation = location;
		tempLocation.setOccupied(false);
		
		location = to;
		location.setOccupied(true);
		
		return true;
	}
	
	public abstract String getName();
	
}

//Alexander Lemkin
//COP 3330 MWF 2:30 pm - 3:20 pm
//Adventure game moving characters on a gui

import java.lang.*;

public class Cave {
	
	public int rows;
	public int columns;
	public boolean occupied = false;
	public boolean markSet = false;
	public boolean open = false;
	public boolean pit = false;
	public boolean blocked = false;
	public boolean teleport = false;
	public boolean dragon = false;
	
	/*public enum CaveType {
		OPEN,
		BLOCKED,
		PIT,
		TELEPORT;
		
	}
		
		public static Cave.CaveType[] values(){
			Cave.CaveType[] tempArr = new Cave.CaveType[4];
			int i = 0;
			for (Cave.CaveType c : Cave.CaveType.values()) {
				Cave.CaveType tempCav = c;
				tempArr[i] = tempCav;
				i++;
			}
			return tempArr;
		}
		public static Cave.CaveType valueOf(String name) {
			if (name == "OPEN")
				return CaveType.OPEN;
			else if	(name == "BLOCKED") 
				return CaveType.BLOCKED;
			else if	(name == "PIT")
				return CaveType.PIT;
			else if	(name == "TELEPORT")
				return CaveType.TELEPORT;
			else
				return null;
		}
*/	
	
	public Cave(int r, int c) {
		rows = r;
		columns = c;
	}
	
	public int getRow() {
		return rows;
	}
	
	public int getCol() {
		return columns;
	}
	
	public void setOccupied(boolean set) {
		occupied = set; 
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	
	public void setMarked(boolean set) {
		markSet = set; 
	}
	
	public boolean isMarked() {
		return markSet; 
	}
	
	public void makeOpen() {
		open = true;
		blocked = false;
		pit = false;
		teleport = false;
		dragon = false;
	}
	
	public void makeDragon() {
		open = false;
		blocked = false;
		pit = false;
		teleport = false;
		dragon = true;
	}
	
	public boolean isDragon() {
		return dragon;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public void makeBlocked() {
		blocked = true;
		open = false;
		pit = false;
		teleport = false;
		dragon = false;
	}
	
	public boolean isBlocked() {
		return blocked;
	}
	
	public void makePit() {
		pit = true; 
		open = false;
		blocked = false;
		teleport = false;
		dragon = false;
	}
	
	public boolean isPit() {
		return pit;
	}
	
	public void makeTeleport() {
		teleport = true;
		pit = false;
		blocked = false;
		open = false;
		dragon = false; 
	}
	
	public boolean isTeleport() {
		return teleport;
	}
	
}

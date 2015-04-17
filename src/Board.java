//Alexander Lemkin
//COP 3330 MWF 2:30 pm - 3:20 pm
//Adventure game moving characters on a gui

import java.lang.*;
import java.util.*;

public class Board {

	public int row;
	public int columns;
	public Cave[][] caveArray;
	//Initializing the board 10% open, 10% teleport, 40% pit, 40% blocked, top left and bottom right open for Treasure and Adventurer.
	public Board(int rows, int cols) { 
		caveArray = new Cave[rows][cols];
		row = rows;
		columns = cols;
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < columns; j++) {
				double rand = Math.random() * 1001;
				if(rand <= 100) {
					caveArray[i][j] = new Cave(i,j);
					caveArray[i][j].makeOpen();
				}
				else if (rand >= 650) {
					caveArray[i][j] = new Cave(i,j);
					caveArray[i][j].makeBlocked();
				}
				else if (rand > 100 && rand < 500) {
					caveArray[i][j] = new Cave(i,j);
					caveArray[i][j].makePit();
				}
				else {
					caveArray[i][j] = new Cave(i,j);
					caveArray[i][j].makeTeleport();	
				}
				caveArray[0][0] = new Cave(0,0);
				caveArray[row-1][columns-1] = new Cave(row-1,columns-1);
				caveArray[0][0].makeOpen();
				caveArray[row-1][columns-1].makeOpen(); 
			}
		}
		caveArray[0][0] = new Cave(0,0);
		caveArray[row-1][columns-1] = new Cave(row-1,columns-1);
		caveArray[0][0].makeOpen();
		caveArray[row-1][columns-1].makeOpen(); 
	}
	
	public Cave getCave(int r, int c) {
		Cave tempCave = caveArray[r][c];
		return tempCave;
	}
	//Checking if the move is within the boundaries of the grid
	public boolean ok(int r, int c) {
		if (r > row-1 || c > columns-1 || r < 0 || c < 0)
			return false;
		else
			return true;
	}
	//Returning a cave on the board grid in a random location that is open and unoccupied
	public Cave getUnoccupiedOpenLocation() {
		Cave tempCave = null;
		boolean tempBool = true;
		while(tempBool) {
			double i = Math.random() * row;
			double j = Math.random() * columns;
				tempCave = caveArray[(int) i][(int) j];
				if((int)i == row-1 && (int)j == columns-1) {
					continue;
				}
				if (tempCave.isOccupied() == false && tempCave.isOpen())
					return tempCave;
			}
		
		return tempCave;
		
	}
	
}

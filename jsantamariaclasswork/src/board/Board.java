package board;

import rooms.Hallway;
import rooms.Room;

public class Board {


    private Hallway[][][] schoolMap;



    public Board(Hallway[][][] schoolMap)
    {
        this.schoolMap = schoolMap;
    }

    public void printMap()
    {

    	for(Hallway[][] floor:schoolMap) {
    		System.out.println("floorx");
    		for(Hallway[] row : floor)
    		{
    			for (Hallway room : row)
	            {
	                room.print();
	            }
	            System.out.println();
	        }
    		System.out.println();
	    }
    }
    public Hallway[][][] getSchoolMap() {
        return schoolMap;
    }

    public void setSchoolMap(Hallway[][][] schoolMap) {
        this.schoolMap = schoolMap;
    }

    
}

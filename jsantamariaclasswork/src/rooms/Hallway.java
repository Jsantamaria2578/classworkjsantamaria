package rooms;

import people.Person;
import items.Item;

public class Hallway extends Room {

    private String[] doorlocations;
    private boolean player;

	public Hallway(boolean[] doors, Person[] people, Item[] items, int x, int y,String[]doorLocations, boolean player)
    {
        super(doors, people, items, x, y);
        this.doorlocations = doorLocations;
        this.player = player;
    }

    public void print()
    {
        if (getOccupants().length != 0)
        {
            System.out.print(getOccupants()[0].print());
        }
        else if (this.explored)
        {
            System.out.print("[ H ]");
        }
        else
        {
            System.out.print("[   ]");
        }

    }
    
    public String toString()
    {
    	boolean[] doors = this.getDoors();
    	String response = "This room is a hallway. It has doors to the ";
    	if (doors[0])
    	{
    		response += "N";
    	}
    	
    	if(doors[1]) {
    		response += " and E";
    	}
    	
    	if (doors[2]) {
    		response += " and S";
    	}
    	
    	if (doors[3]) {
    		response += " and W";
    	}
    	
    	return response;
    }
    
    public String generateAllDirection() {
    	if(doorlocations.length == 1) {
    		return "An entrance can be seen to the" + doorlocations[0];
    	}
    	if(doorlocations.length == 2)
    		return "Theres an entrance to the " + doorlocations[0] + " and " + doorlocations[1] + ".";
    	if(doorlocations.length == 3)
    		return "You see many entrances, one to the " + doorlocations[0] + ", the " + doorlocations[1] + ", and " + doorlocations[2] + ".";
}

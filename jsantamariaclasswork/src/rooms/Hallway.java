package rooms;

import people.Person;
import People.NPC;
import items.Item;

public class Hallway extends Room {

    public String[] doorlocations;
    private boolean player;
    private String description;
    private int items;
    private boolean itemExist;
    private boolean explored;

	public Hallway(NPC people,boolean itemExist, Item items, int x, int y,String[]doorLocations, boolean player,String description,boolean explored)
    {
        super(people, items, x, y);
        this.doorlocations = doorLocations;
        this.player = player;
        this.description = description;
        this.itemExist = itemExist;
        this.explored = explored;
    }

    public void print()
    {
        if (this.player)
        {
            System.out.print("[ P ]");
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
    public void togglePlayer() {
    	this.player = !this.player;
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
    	return null;
    	}
    	
    public String createDescription() {
    	if(this.itemExist)
    		return this.description + " " + this.generateAllDirection() + " You see an something in the corner of the room";
    	else
    		return this.description + " " + this.generateAllDirection();
    }
}

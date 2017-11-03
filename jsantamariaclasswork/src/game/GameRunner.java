package game;

import items.Item;
import rooms.*;
import people.Person;
import java.util.Scanner;

import People.Human;
import People.NPC;
import board.Board;

public class GameRunner {

    public static void main (String[] args)
    {
    	int[] playerCords = {(int) Math.random() * 4, (int) Math.random() * 4};
        Room[][][] map = new Room[3][3][3];
        for(int x = 0; x < map.length; x++) {
	        for (int j = 0; j<map.length; j++)
	        {
	        	Room[] row = map[x][j];
	            for (int i = 0; i<row.length;i++)
	            {
	                String[] doors = gameUtilities.findDoors(j,i);
	                NPC people = new NPC("test1","doesnt matter",items,"help","deadly ill");
	                		// for reference again public NPC(String name, String location, String item, String dialouge, String description){
	                Item[] items = {};
	                if(j == playerCords[0]&& i == playerCords[1])
	                	row[j] = new Hallway(people, items, i, j,doors,true);
	                // my hallway for reference 	public Hallway(Person[] people, Item[] items, int x, int y,String[]doorLocations, boolean player)
	                else
	                	row[j] = new Hallway(people, items, i, j,doors,false);
	            }
	
	        }
        }
        Board tech = new Board(map);
        gameUtilities gameUtilities = new gameUtilities();

        Item[] playerbag = new Item[2];
        boolean gameOn = true;
        Human player1 = new Human("spud","doesntmatter", playerbag);
        Scanner in = new Scanner(System.in);
        System.out.println("Hello there, welcome to the start of your journey! Are you a boy or a girl?");
        in.next();
        System.out.println("I see, your a potato, thats perfect you'll fit right in to this story");
        in.next();
        System.out.println("Spud, thats an oddly convinient name for this story.");
        System.out.println("Now spud, are you ready to start your journey?.");
        
        System.out.println("Great lets get started!");
        System.out.println("Spud, thats an oddly convinient name for this story.");
        System.out.println("You are a potato. But not any normal potato for you see you were born with special powers");
        System.out.println("You were born with the powers of sight, the common sense of a human, rolling, and opposable buds!");
        System.out.println("You see that many potatos have been being abducted, you notice that they are being put in");
        System.out.println("boxes being loaded into a mysterious truck, you've never seen the logo before.");
        System.out.println("Will you follow the truck, or will you sneak aboard it?");
        String FirstDecision = "Will you follow the truck, or will you sneak aboard it?";
        String response1 = in.next();
        if(gameUtilities.findKeyword(response1,"sneak",0) != -1 || gameUtilities.findKeyword(response1,"board",0) != -1 ) {
        	System.out.println("You try to hop aboard the truck, you realize you dont have any real legs, luckily one of the");
        	System.out.println("the people loading the truck think you fell and throw you in there.");
        	System.out.println("Your fellow potatos sit in silence with you, all fearing the unknown");
        	System.out.println("Eventually the truck opens up revealing a harsh light,you being thrown in so carelessly");
        	System.out.println("You roll away and witness the people from afar");
        }
        else if(gameUtilities.findKeyword(response1,"follow",0) != -1) {
        	System.out.println("You decided to follow the truck? Good luck there spud.");
        	System.out.println("2 hours later");
        	System.out.println("Thanks to the heavy traffic you manage to keep up with the truck.");
        	System.out.println("You watch the same person who loaded the truck from afar");
        }
        else {
        	System.out.println("Im not sure what you said but the truck left, better start rolling now");
        	System.out.println("2 hours later");
        	System.out.println("Thanks to the heavy traffic you manage to keep up with the truck.");
        	System.out.println("You watch the same person who loaded the truck from afar");
        }
        System.out.println("You cant see clearly but they are taking it into the back of some building");
    	System.out.println("The building smells of... OH GOD, potatos, being burned and tortured");
    	System.out.println("Out of the corner of your eye, you spot your brother and rush into the building");
    	System.out.println("You cant find your brother and run around everywhere, your lost, but not before");
    	System.out.println("you realize, you have no brother.");
    	System.out.println("It might have not been your brother, but it could have been someone elses brother and you must save them.");
    	int posx = 0;
    	int posy = 0;
        while(gameOn)
        {
            System.out.println("Where would you like to move");
         //   map[0][0].addOccupant(player1);

            tech.printMap();
          //  player1.printRoom();
            String move = player1.chooseMove();
            Utilities.movePlayer(tech, player1,move);
            //gameOn = false;
            







        }
		in.close();
    }

}




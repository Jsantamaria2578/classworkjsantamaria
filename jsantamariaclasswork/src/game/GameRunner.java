package game;

import items.Item;
import rooms.*;
import people.Person;

import java.util.Scanner;

public class GameRunner {

    public static void main (String[] args)
    {
        Room[][][] map = new Room[3][5][5];
        for(int x = 0; x < map.length; x++) {
	        for (int j = 0; j<map.length; j++)
	        {
	        	Room[] row = map[x][j];
	            for (int i = 0; i<row.length;i++)
	            {
	                boolean[] doors = {true,true,true,true};
	                Person[] people = {};
	                Item[] items = {};
	
	                row[i] = new Hallway(doors, people, items, i, j);
	            }
	
	        }
        }
        School tech = new School(map);


        boolean gameOn = true;
        Person player1 = Utilities.createPerson();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Welcome to the Halls of Tech, " + player1.getFirstName());
            map[0][0].addOccupant(player1);

            tech.printMap();
            player1.printRoom();
            String move = player1.chooseMove();
            Utilities.movePlayer(tech, player1,move);
            //gameOn = false;
            







        }
		in.close();
    }

}




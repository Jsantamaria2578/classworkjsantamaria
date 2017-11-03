package game;

import rooms.Hallway;

public class gameUtilities {
	private static int posx;
	private static int posy;
	public static String setCordinate(int floor) {
		 return floor + "'" + (int) Math.random() * 10 + (int) Math.random() * 10 ; /* MOVE THIS TO UTILITES*/
	}
	
	public static void moveplayer(String direction, Hallway room) {
		if(direction.equals("north") && findDoorNorth(room) ) {
			posy = posy - 1;
		}
		else if(direction.equals("south") && findDoorSouth(room) ) {
			posy = posy + 1;
		}
		else if(direction.equals("west") && findDoorWest(room) ) {
			posx = posx - 1;
		}
		else if(direction.equals("east") && findDoorEast(room) ) {
			posx = posx + 1;
		}
		else
			System.out.println("what did you say?" );
	}
	public static String[] findDoors(int x, int y) {
		if(x == 3) {
			if( y ==3) {
				String[] tempstring = {"North","West"};
				return tempstring;
			}
			else if(y == 0) {
				String[] tempstring = {"South","West"};
				return tempstring;
			}
			else {
				String[] tempstring = {"North","West","South"};
				return tempstring;
			}
		}
		else if(x == 0) {
			if( y ==3) {
				String[] tempstring = {"North","East"};
				return tempstring;
			}
			else if(y == 0) {
				String[] tempstring = {"South","East"};
				return tempstring;
			}
			else {
				String[] tempstring = {"North","East","South"};
				return tempstring;
			}
		}
		else {
			if(y ==3) {
				String[] tempstring = {"North","East","West"};
				return tempstring;
			}
			else if(y == 0) {
				String[] tempstring = {"South","East","West"};
				return tempstring;
			}
			else {
				String[] tempstring = {"North","East","South","West"};
				return tempstring;
			}
		}
	}
		public static int findKeyword(String statement, String goal,int startPos) {
			String phrase = statement.trim().toLowerCase();
			goal = goal.toLowerCase();
			
			// The only change to incorporate the startPos is in
			// the line below
			int psn = phrase.indexOf(goal, startPos);
			
			// Refinement--make sure the goal isn't part of a
			// word
			while (psn >= 0) {
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0) {
			before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length()) {
			after = phrase.substring(
			  psn + goal.length(),
			  psn + goal.length() + 1);
			}
			
			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
			.compareTo("z") > 0)) // before is not a
			// letter
			&& ((after.compareTo("a") < 0) || (after
			.compareTo("z") > 0))) {
			return psn;
			}
			
			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal, psn + 1);
			}
			return -1;
			}
		
		public static boolean findDoor(String doordirection,Hallway room) {
			for(int i = 0;i < room.doorlocations.length; i ++) {
				if(room.doorlocations[i].equals("doordirection")){
					return true;
			 }
			return false;
				
		}
		
		public static boolean findDoorNorth(Hallway room) {
			return findDoor("North",room);
				
		}
		
		public static boolean findDoorSouth(Hallway room) {
			return findDoor("South",room);
				
		}
		
		public static boolean findDoorWest(Hallway room) {
			return findDoor("West",room);
				
		}
		
		public static boolean findDoorEast(Hallway room) {
			return findDoor("East",room);
				
		}
}

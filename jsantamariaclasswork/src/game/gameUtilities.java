package game;

public class gameUtilities {
	public static String setCordinate(int floor) {
		 return floor + "'" + (int) Math.random() * 10 + (int) Math.random() * 10 ; /* MOVE THIS TO UTILITES*/
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

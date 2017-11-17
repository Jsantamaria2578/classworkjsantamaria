package donows;

public class HorseBarn {
	private Horse[] spaces;
	
	public HorseBarn(Horse[] spaces){
		this.spaces = spaces;
	}
	
	public int findHorseSpace(String name) {
		for(int i = 0; i < this.spaces.length;i++) {
			if(this.spaces[i]!=null) {
				if(this.spaces[i].getName().equals(name)) {
					return i;
				}
			}
		}
		return -1;
	}
	public void consolidate() {
		for(int i = 1; i < this.spaces.length; i++) {
			if(this.spaces[i] != null) {
				boolean con = false;
				int pos = i;
				while(!con) {
					if(pos - 1 == -1)
						con = true;
					else if(this.spaces[pos - 1] != null)
						con = true;
					else {
						this.spaces[pos - 1] = this.spaces[pos];
						this.spaces[pos] = null;
						pos--;
					}
				}
			}
		}
	}
	
	public String toString() {
		String tempstring = "";
		for(int i = 0; i < this.spaces.length;i++) {
			if(this.spaces[i] == null) {
				tempstring+= "[null]";
			}
			else
				tempstring+="[" + this.spaces[i].getName() + "]";
		}
		return tempstring;
		}
}

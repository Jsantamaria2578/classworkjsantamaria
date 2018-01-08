package donows;

public class APLine {
	
	private int a;
	private int b;
	private int c;
	public static void main(String[] args) {
		APLine line1 = new APLine(5,4,17);
		System.out.println(line1.getSlope());
		System.out.println(line1.isOnLine(5, -2));
	}
	public APLine(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getSlope() {
		double tempA = this.a * -1;
		return tempA / (double)this.b;
	}
	
	public boolean isOnLine(int x, int y) {
		return ((this.a * x) + (this.b * y) - this.c) == 0;
	}
}

package People;

public class Human extends Person {
	private int health;
	private int hope;
	private String[] decision;
	public Human(String name, String location, Item item, int health, int hope, String[] decision){
		super(name,location,item);
		this.health = health;
		this.hope = hope;
		this.decision = decision;
	}
	
}

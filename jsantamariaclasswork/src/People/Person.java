package People;

public abstract class Person {
	private String name;
	private String location;
	private Item[] item;
	
	Person(String name, String location, Item item){
		this.name = name;
		this.location = location;
		this.item = item;
	}
	
	public abstract String setCordinate(int floor);
	
}

package People;

public class NPC extends Person {
	private String dialougue;   
	private String description;
	
	public NPC(String name, String location, String item, String dialouge, String description){
		super(name,location,item);
		this.dialougue = dialouge;
		this.description = description;
		
	}
	
}

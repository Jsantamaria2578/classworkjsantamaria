package donows;

public class Mustang implements Horse {
	private String name;
	private int weight;
	
	Mustang(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return this.name;
	}

	public int getWeight() {
		return this.weight;
	}

}

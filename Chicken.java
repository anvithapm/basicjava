
public class Chicken {
	String name;
	int age;
	String farm;
	
	Chicken(String name, int age, String farm){
		this.name = name;
		this.age = age;
		this.farm = farm;
	}
	
	void layEgg(int numberOfEggs){
		eatEgg(numberOfEggs);
	}
	
	private void eatEgg(int numberOfEggs){
		System.out.println("I am eating " + numberOfEggs + " eggs for dinner");
	}
}

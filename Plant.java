
public class Plant {
	String planttype;
	int age;

	Plant(String planttype, int age) {
		this.planttype = planttype;
		this.age = age;
	}

	void grow(String plantColor) {
		makeFood(plantColor);
	}

	private void makeFood(String plantColor) {
		System.out.println("The plant's leaf color is " + plantColor + ", so it is making food");
	}
}

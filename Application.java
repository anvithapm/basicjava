public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating my own data type");
		Dog D1 = new Dog();
		D1.age = 2;
		D1.name = "Poppy";
		D1.gender = "female";
		D1.color = "golden";
		D1.type = "Golden Retriever";
		
		System.out.println(D1.age);
		System.out.println(D1.name);
		System.out.println(D1.gender);
		System.out.println(D1.color);
		System.out.println(D1.type);
	}

}

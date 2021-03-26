//This class is to test the inheritance
public class HW5Test {
	//This main function will create animals and print their information out
	public static void main(String[] args) {
		Animal myPet = new Animal(12, 24);

		System.out.println(myPet);
		
		Dog max = new Dog(100, 56, "Max", "Lab", "09/22/2002");
		
		System.out.println(max);
		
		Cat sparkie = new Cat(25, 36, "Sparkie", 9);
		
		System.out.println(sparkie);
		
		System.out.printf("Removing a life from %s%n", sparkie.getName());
		sparkie.setLives(sparkie.getLives()-1);
		
		System.out.println(sparkie);
		
		Bird birdy = new Bird(2, 8, 12, true);
		
		System.out.println(birdy);
	}

}

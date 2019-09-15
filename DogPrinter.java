
public class DogPrinter {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Lily", 5);
		Dog dog2 = new Dog("Jacob", 2);
		Dog dog3 = new Dog("Sugar", 8);
		Dog dog4 = new Dog("Bush", 3);

		Dog[] dogs = { dog1, dog2, dog3, dog4 };

		for (Dog dogNameAndAge : dogs) {
			System.out.println(dogNameAndAge);
		}
	}
}

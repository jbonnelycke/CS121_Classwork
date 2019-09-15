// ******************************************************************
// ChangingPeople.java
//
// Demonstrates parameter passing -- contains a method that should
// change to Person objects.
// ******************************************************************
public class ChangingPeople {
	// ---------------------------------------------------------
	// Sets up two person objects, one integer, and one String
	// object. These are sent to a method that should make
	// some changes.
	// ---------------------------------------------------------
	public static void main(String[] args) {
		Person person1 = new Person("Sally", 13);
		Person person2 = new Person("Sam", 15);

		int age = 21;
		String name = "James";
		changePeople(person1, person2, age, name);
		System.out.println("\nValues after calling changePeople...");
		System.out.println("person1: " + person1);
		System.out.println("person2: " + person2);
		System.out.println("age: " + age + "\tname: " + name + "\n");
	}

	// -------------------------------------------------------------------
	// Change the first actual parameter to "Jack - Age 101" and change
	// the second actual parameter to be a person with the age and
	// name given in the third and fourth parameters.
	// -------------------------------------------------------------------
	public static void changePeople(Person p1, Person p2, int age, String name) {
		// Make changes
		p1.changeName("Jack");
		p1.changeAge(101);
		p2.changeName(name);
		p2.changeAge(age);
	}
}
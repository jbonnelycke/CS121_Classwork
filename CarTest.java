
public class CarTest {
	public static void main(String[] args) {
		Car myFirstCar = new Car("Kia Soul", 2011);
		
		System.out.println(myFirstCar.getMake());
		System.out.println(myFirstCar.getYear());
		
		myFirstCar.setMake("Suburban");
		myFirstCar.setYear(2001);
		
		System.out.println(myFirstCar);
	}
}

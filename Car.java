
public class Car {
	private String make;
	private int year;
	
	//This is the constructor of the class
	public Car(String carMake, int carYear) {
		make = carMake;
		year = carYear;
	}
	
	//This is the make getter
	public String getMake() {
		return make;
	}
	
	//This is the year getter
	public int getYear() {
		return year;
	}
	
	//This is the make setter
	public void setMake(String m) {
		make = m;
	}
	
	//This is the year setter
	public void setYear(int y) {
		year = y;
	}
	
	public String toString() {
		String result = "This car is a " + Integer.toString(year) + " " + make;
		return result;
	}
}

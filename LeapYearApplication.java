import java.util.Scanner;
public class LeapYearApplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a year:");
		int inputYear = scan.nextInt();
		
		if (checkIsLeapYear(inputYear) == true) {
			System.out.println("This is a leap year! Hooray!");
		}
		else {
			System.out.println("Boo! This isn't a leap year.");
		}
	}
	public static boolean checkIsLeapYear(int inputYear) {
		if (inputYear < 1582) {
			boolean leapYear = false;
			return leapYear;
		}
		else if ((inputYear % 4 == 0) && (inputYear % 100 != 0) || (inputYear % 400 == 0)) {
			boolean leapYear = true;
			return leapYear;
		}
		else {
			boolean leapYear = false;
			return leapYear;
		}
	}
}

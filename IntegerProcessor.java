import java.util.Scanner;
import java.io.*;

public class IntegerProcessor {
	public static void main(String[] args) throws IOException {
		int number, sum = 0, index = 0;
		double average;
		Scanner fileScan;
		fileScan = new Scanner(new File("intList.txt"));
		
		while (fileScan.hasNext()) {
			number = fileScan.nextInt();
			System.out.println(number);
			sum += number;
			index++;
		}
		average = (double) sum / (index);
		System.out.println("The average of these " + index + " numbers is " + average);
	}
}

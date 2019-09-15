import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random generator = new Random();
		int num1;

		num1 = generator.nextInt(6) + 1;

		System.out.println("The deadly die of Death rolled: " + num1);
	}
}

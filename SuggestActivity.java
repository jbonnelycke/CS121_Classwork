import java.util.Scanner;
public class SuggestActivity {
	public static void main(String[] args) {
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("Welcome to Lake LazyDays Resort");
		System.out.println("======================================");
		System.out.println("What's the temperature outside, today?");
		System.out.println("======================================");
		temp = scan.nextInt();
		
		if (temp >= 80) 
			System.out.println("A nice swim might refresh you!");
		else if ((temp < 80) && (temp >= 60))
			System.out.println("What lovely-sounding weather! What a great day for a game of tennis!");
		else if ((temp < 60) && (temp >= 40))
			System.out.println("Sounds a little brisk outside. Perhaps a relaxing game of golf. \nDon't forget your jacket!");
		else if (temp < 40) {
			System.out.println("Skiing sounds fun on a cold day like today!" +
					" Don't forget to stop by our hot chocolate stand.");
		}
	}
}

import java.util.Scanner;

public class IntWrapper {
	public static void main(String[] args) {
		String int1, int2;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter one integer: ");
		int1 = scan.next();
		System.out.println("Please enter another integer: ");
		int2 = scan.next();
		
		int i1 = Integer.parseInt(int1);
		int i2 = Integer.parseInt(int2);
		
		int sum = i1 + i2;
		
		System.out.println(sum);
	}

}

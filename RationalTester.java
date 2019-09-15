
public class RationalTester {
	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(6, 8);
		RationalNumber r2 = new RationalNumber(4, 3);
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println(r1.compareTo(r2));
	}
}

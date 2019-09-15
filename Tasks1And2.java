
public class Tasks1And2 {
	public static void main(String[] args) {
//		int[] primes = {1, 2, 3, 5, 7};
		
		int[] primes = new int[5];
		primes[0] = 1;
		primes[1] = 2;
		primes[2] = 3;
		primes[3] = 5;
		primes[4] = 7;

//		for (int i = 0; i < primes.length; ++i) {
//			System.out.println(primes[i]);
//		}
	
		for (int prime : primes) {
			System.out.println(prime);
		}
	}
}

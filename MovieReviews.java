
public class MovieReviews {
	public static void main(String[] args) {
		// Creating the empty array of reviews
		int[][] reviews = new int[10][5];
		
		// Populating the array of reviews with 2
		for (int row = 0; row < reviews.length; row++) {
			for (int col = 0; col < reviews[row].length; col++) {
				reviews[row][col] = 2;
			}
		}
		
		// Specifying certain values for certain movies
		reviews[1][4] = 3;
		reviews[3][0] = 1;
		
		//Printing the array
		System.out.println("\t\tRating of 10 Movies\n");
		
		for (int row = 0; row < 5; row++) {
			System.out.print("\t movie" + (row + 1));
		}
		
		System.out.println();
		
		for (int row = 0; row < reviews.length; row++) {
			System.out.print("reviewer" + (row +1) + ":\t");
			for (int col = 0; col < reviews[row].length; col++) {
				System.out.print(reviews[row][col] + "\t");
			}
			System.out.println();
		}
	}
}

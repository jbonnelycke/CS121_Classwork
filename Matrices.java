public class Matrices {
	public static int NROWS = 3;
	public static int NCOLS = 3;

	public static void main(String[] args) {
		// Declare and allocate matrices
		int[][] matrix0 = new int[NROWS][NCOLS];
		int[][] matrix1 = new int[NROWS][NCOLS];
		int[][] sum = new int[NROWS][NCOLS];

		// Initialize the matrices
		for (int row = 0; row < NROWS; row++) {
			for (int col = 0; col < NCOLS; col++) {
				matrix0[row][col] = row * 10 + col;
				matrix1[row][col] = col * 10 + row;
			}
		}

		// Add and multiply the matrices
		sum = addMatrix(matrix0, matrix1);

		// Print the matrices
		System.out.println("First Matrix");
		printMatrix(matrix0);
		System.out.println("Second Matrix");
		printMatrix(matrix1);

		// print sum matrix
		System.out.println("Sum of Matrices");
		printMatrix(sum);
	}

	private static int[][] addMatrix(int[][] m0, int[][] m1) {
		int[][] m2 = new int[NROWS][NCOLS];
		for (int row = 0; row < NROWS; row++) {
			for (int col = 0; col < NCOLS; col++) {
				m2[row][col] = m0[row][col] + m1[row][col];
			}
		}
		return m2;
	}

	private static void printMatrix(int[][] matrix) {
		for (int row = 0; row < NROWS; row++) {
			for (int col = 0; col < NCOLS; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
}
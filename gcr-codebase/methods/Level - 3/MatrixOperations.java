public class MatrixOperations {

    // creating method to generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); 
            }
        }
        return matrix;
    }

    // creating method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {

        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // creating method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {

        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // creating method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // creating method to display matrix
    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;

        int[][] A = generateMatrix(rows, cols);
        int[][] B = generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition of A and B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nSubtraction of A and B:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nMultiplication of A and B:");
        displayMatrix(multiplyMatrices(A, B));
    }
}

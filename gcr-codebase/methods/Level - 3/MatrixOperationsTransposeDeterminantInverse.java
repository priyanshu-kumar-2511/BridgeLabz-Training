public class MatrixOperationsTransposeDeterminantInverse {

    // creating method to generate random matrix
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }

    // creating method to find transpose of matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] transpose = new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // creating method to find determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // creating method to find determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // creating method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    // creating method to find inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // creating method to display matrix
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        double[][] matrix = generateMatrix(3, 3);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix));

        System.out.println("\nDeterminant (3x3): " + determinant3x3(matrix));

        System.out.println("\nInverse (3x3):");
        displayMatrix(inverse3x3(matrix));
    }
}

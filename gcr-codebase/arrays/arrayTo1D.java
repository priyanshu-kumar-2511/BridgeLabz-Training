import java.util.Scanner;
class arrayTo1D{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Creating 2D array
        int[][] matrix = new int[rows][columns];

        // taking input from user for fill up
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Creating 1D Array
        int[] array = new int[rows * columns];

        // Copy elements of 2D array to 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // diplaying the results
        System.out.println("Elements in the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}

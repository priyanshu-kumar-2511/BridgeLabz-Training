import java.util.Scanner;
class youngestAndTallest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Taking input from user
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + friends[i] + " is: ");
            heights[i] = input.nextDouble();
        }

        // Finding the youngest friend 
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Findind the tallest friend 
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Displaying the results
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex]);

        input.close();
    }
}

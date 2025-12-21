import java.util.Scanner;
public class YoungestAndTallestFriend {

    // creating method to find the youngest friend
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // creating method to find the tallest friend
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // taking input from user
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = input.nextDouble();
        }

        // calling methof to find youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Youngest friend is: " + names[youngestIndex]);
        System.out.println("Tallest friend is: " + names[tallestIndex]);

        input.close();
    }
}

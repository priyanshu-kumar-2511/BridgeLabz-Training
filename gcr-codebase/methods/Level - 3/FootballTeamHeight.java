import java.util.Arrays;
public class FootballTeamHeight {

    // create method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    // create method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // create method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            min = Math.min(min, heights[i]);
        }
        return min;
    }

    // create method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            max = Math.max(max, heights[i]);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        // generating random heights (150–250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        System.out.println("Player Heights (cm): " + Arrays.toString(heights));

        // calling methods
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
    }
}

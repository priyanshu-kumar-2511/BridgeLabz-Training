import java.util.Scanner;
import java.util.Arrays;

public class QuadraticRoots {

    // Method to find roots and return them as an array
    public static double[] findRoots(double a, double b, double c) {

        double delta = Math.pow(b, 2) + 4 * a * c;

        // if delta is negative → no real roots
        if (delta < 0) {
            return new double[0];
        }

        // if delta is zero → one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // if delta is positive → two roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            System.out.println("Roots: " + Arrays.toString(roots));
        }

        input.close();
    }
}

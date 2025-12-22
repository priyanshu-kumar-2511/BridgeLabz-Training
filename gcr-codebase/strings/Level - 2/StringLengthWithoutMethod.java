import java.util.Scanner;
public class StringLengthWithoutMethod {

    // create method to find length 
    public static int findLengthManually(String text) {
        int count = 0;

        try {
            while (true) {   // infinite loop
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int manualLength = findLengthManually(text);

        int builtInLength = text.length();

        System.out.println("Length without using length(): " + manualLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}
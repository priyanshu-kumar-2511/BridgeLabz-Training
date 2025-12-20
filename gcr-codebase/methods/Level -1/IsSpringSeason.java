import java.util.Scanner;
public class IsSpringSeason{

    // Creating a method to check the date is in the Spring Season or not
    public static boolean isSpringSeason(int month, int day) {
        if (month > 3 && month < 6) {
            return true;
        } else if (month == 3 && day >= 20) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        // Checking the date is in the Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season!");
        } else {
            System.out.println("Not a Spring Season.");
        }
        input.close();
    }
}

import java.util.Scanner;
public class LeapYearCheck{
    // Method to check leap year
    public static boolean isLeapYear(int year){

        // divisible by 4 and not divisible by 100
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);

        // divisible by 400
        boolean conditionB = (year % 400 == 0);
        return conditionA || conditionB;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // checking Gregorian calendar year or not
        if (year < 1582) {
            System.out.println("Invalid year!");
            return;
        }
        
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
	input.close();	
    }
}

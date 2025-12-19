import java.util.Scanner;
class leapYear{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking a year from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Checking year is valid for Gregorian calendar
        if (year >= 1582) {
        // checking yaer is a leap year or not        
            if (year % 400 == 0) {
                System.out.println(year+" is a Leap Year");
            } 
            else if (year % 100 == 0) {
                System.out.println(year+" is not a Leap Year");
            } 
            else if (year % 4 == 0) {
                System.out.println(year+" is a Leap Year");
            } 
            else {
                System.out.println(year+" is not a Leap Year");
            }
        }
        else {
            System.out.println("Year must be 1582 or later.");
        }
        input.close();
    }
}

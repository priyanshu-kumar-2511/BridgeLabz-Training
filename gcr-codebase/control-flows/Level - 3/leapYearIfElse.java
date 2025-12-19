import java.util.Scanner;
class leapYearIfElse{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking year from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Checking year is valid for Gregorian calendar
        if (year >= 1582) {
 
        // checking year is a leap or not
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year+" is a Leap Year");
            } 
            else {
                System.out.println(year+" is not a Leap Year");
            }
        } 
        else {
            System.out.println(year+" must be 1582 or later.");
        }
        input.close();
    }
}

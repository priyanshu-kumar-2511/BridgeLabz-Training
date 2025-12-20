import java.util.Scanner;
public class PositiveOrNegativeNumber{
	// creating method of checking positive or negative number
    public static String checkingPositiveOrNegativeNumber(int number){
	    if(number >= 0){
		    if(number % 2==0){
			    return "even";
			} else {
                return "odd";	
            }
        } else {
		    return "negative";
		}
    }
	// creating method of Compare first and last elements
	public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
		// taking input from user and 
		//calling method of checking positive or negative number 
		int[] number = new int[5];
		System.out.println("Enter 5 numbers: \n");
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            number[i] = input.nextInt();
            System.out.println("Number is "+ checkingPositiveOrNegativeNumber(number[i]));
        }
        
		// calling method of Compare first and last elements 
        int result = compare(number[0], number[number.length - 1]);

        System.out.println("\nComparison of first and last elements:");
        if (result == 1) {
            System.out.println("First element is Greater than last element");
        } else if (result == 0) {
            System.out.println("First element is Equal to last element");
        } else {
            System.out.println("First element is Less than last element");
        }
	input.close();
	}
}	
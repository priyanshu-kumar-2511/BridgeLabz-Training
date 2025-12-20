import java.util.Scanner;
public class CheckingNumber{
       public static int checkingNumberIs(float number){
	        
			// creating a method for checking a number is positive, negative or zero
	        if (number > 0){ // if number is positive
			    return 1;
			} else if(number == 0){ // if number is zero
                return 0;
            } else {         // if number is negative
                return -1;
            }
        }
        public static void main(String [] args){
		    Scanner input = new Scanner(System.in);
			
			// taking a number from user
            System.out.print("Enter a number: ");
            float number = input.nextFloat();
			
			// calling method
			float checkingNumberIs = CheckingNumber.checkingNumberIs(number);
			System.out.print("The number is "+ checkingNumberIs);
			input.close();
		}
}		
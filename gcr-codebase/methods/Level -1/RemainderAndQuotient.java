import java.util.Scanner;
public class RemainderAndQuotient{
        // creating method to find reaminder and qoutient of a number
        public static int[] findRemainderAndQuotient(int number, int divisor){
	        int qoutient = number / divisor;
	        int remainder = number % divisor;
	        return new int[] {qoutient, remainder};
	    }
	    public static void main(String [] args){
	        Scanner input = new Scanner(System.in);
 
            // taking a number and divisor from user
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.print("Enter a divisor: ");
            int divisor = input.nextInt();
            
			// calling method
            int[] result = findRemainderAndQuotient(number, divisor);
			
			System.out.println("Qoutient of a number is " + result[0]);
			System.out.println("Reminder of a number is " + result[1]);
			
			input.close();
		}
}		
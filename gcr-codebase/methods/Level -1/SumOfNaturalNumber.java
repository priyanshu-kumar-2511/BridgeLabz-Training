import java.util.Scanner;
public class SumOfNaturalNumber{
    
	   // creating a method for checking the numberis natural number or not 
	   //then sum of n natural number 
       public static int sumOfNaturalNumber(int number){
	        int sum =0;
	        if (number > 0){
                for(int i=0; i<= number; i++){
				sum += i;
				}
				return sum;
		    }else{
			    return -1;
				}
		}
 		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		// taking a number from user
		System.out.print("Enter a natural number : ");
		int number = input.nextInt();
		
		// Calling method
		int sum = SumOfNaturalNumber.sumOfNaturalNumber(number);
		System.out.print("Sum of "+ number + " natural number is "+sum);
		
		input.close();
		}
}		
			  
import java.util.Scanner;
class factorsOfNumber{
    public static void main(String[] args){
	
        Scanner input = new Scanner(System.in);
        
        // taking number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int maxFactor = 10;  
        int[] factors = new int[maxFactor]; 
        int index = 0;  
        
        //finding factors of a number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
                if (index == maxFactor) { 
                    maxFactor *= 2;
                    // Create a new array of the increased size
                    int[] temp = new int[maxFactor];
                    
                    // Copying an old elements to the new array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        
        // Displaying the factors
        System.out.print("The factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(); 

        input.close();
    }
}

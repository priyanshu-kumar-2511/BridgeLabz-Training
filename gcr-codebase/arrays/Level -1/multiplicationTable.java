import java.util.Scanner;
class multiplicationTable{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int[] multiplicationTable = new int[10];
        
        // calculating the multiplication table
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }
        
        // Displaying the multiplication table 
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
        input.close();
    }
}

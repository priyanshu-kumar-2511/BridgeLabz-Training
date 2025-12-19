import java.util.Scanner;
class multiplicationTable2{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int[] multiplicationTable = new int[9-6+1];
        
        // calculating the multiplication table
        for (int i = 6; i <= 9; i++) {
            multiplicationTable[i - 6] = number * i;
        }
        
        // Displaying the multiplication table 
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationTable[i]);
        }
        input.close();
    }
}

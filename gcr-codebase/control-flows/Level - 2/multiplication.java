import java.util.Scanner;
class multiplication{
      public static void main(String[] args){
     
      Scanner input = new Scanner(System.in);
        
        // taking number from user 
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // calculating multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
} 
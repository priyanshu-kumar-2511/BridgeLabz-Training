import java.util.Scanner;
class calculator{
      public static void main(String [] args){
     
      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter First Number : ");
      float first_number = sc.nextInt();

      System.out.print("Enter Second Number : ");
      float second_number = sc.nextInt();
      
      float addition = first_number + second_number;
      float subtraction = first_number + second_number;
      float multiplication = first_number + second_number;
      float division = first_number + second_number;
      
      // Displaying
      System.out.print("The addition, subtraction, multiplication, and division value of 2 numbers " + first_number +" and " + second_number + " is "+ addition + ", " + subtraction +", "+ multiplication + ", and " + division);
      sc.close();
      }
} 
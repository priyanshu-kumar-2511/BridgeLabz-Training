import java.util.Scanner;
class Square{
      public static void main(String [] args){
      
      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);
      
      // Taking input from user
      System.out.print("Enter the perimeter of square : ");
      int perimeter = sc.nextInt();
      
      // Displaying the length of the square
      System.out.print("The length of the side is " + perimeter/4+ " whose perimeter is " + perimeter);
      }
}


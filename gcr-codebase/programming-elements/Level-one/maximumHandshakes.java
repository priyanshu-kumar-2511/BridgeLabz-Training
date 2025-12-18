import java.util.Scanner;
class maximumHandshakes{
      public static void main(String [] args){
  
      Scanner input = new Scanner(System.in);
     
      // taking number of students from user
      System.out.print("Enter the number of students: ");
      int numberOfStudents = input.nextInt();
      
      // calculating the number of possible handshakes and displaying 
      int numberOfPossibleHandshakes = (numberOfStudents * (numberOfStudents-1))/2;

      System.out.print("The number of possible handshakes is " + numberOfPossibleHandshakes);
     
      input.close();
      }
}
  
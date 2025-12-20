import java.util.Scanner;
public class MaximumHandshakes{
      // Creating method for calculating the maximum number of handshakes posiible
       public static int calculatingMaximumHandshakes(int number){
	          int numberOfHandshakes = (number *(number - 1))/2;
                return numberOfHandshakes;
        }
   
       public static void main(String[] args){
              Scanner input = new Scanner(System.in);
              // taking number of students from user
              System.out.print("Enter the Number of Students : ");
              int numberOfStudents = input.nextInt();
              
              // calling method for calculating the maximum number of handshakes posiible 
              int numberOfHandshakes = MaximumHandshakes.calculatingMaximumHandshakes(numberOfStudents);
              // printing the results
              System.out.print("The Maximum Number of Possible Handshakes is "+ numberOfHandshakes);
        }
}		
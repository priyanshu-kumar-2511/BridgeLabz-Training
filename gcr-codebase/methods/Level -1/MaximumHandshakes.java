import java.util.Scanner;
public class MaximumHandshakes{
      // Creating method for calculating the maximum number of handshakes posiible
       public static double calculatingMaximumHandshakes(double number){
	          double numberOfHandshakes = (number *(number - 1))/2;
                return numberOfHandshakes;
        }
   
       public static void main(String[] args){
              Scanner input = new Scanner(System.in);
              // taking number of students from user
              System.out.print("Enter the Number of Students : ");
              double numberOfStudents = input.nextDouble();
              
              // calling method for calculating the maximum number of handshakes posiible 
              double numberOfHandshakes = MaximumHandshakes.calculatingMaximumHandshakes(numberOfStudents);
              // printing the results
              System.out.print("The Maximum Number of Possible Handshakes is "+ numberOfHandshakes);
        }
}		
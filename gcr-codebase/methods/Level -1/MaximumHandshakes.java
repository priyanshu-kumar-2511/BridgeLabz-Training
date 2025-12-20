import java.util.Scanner;
public class MaximumHandshakes{
       public static double calculatingMaximumHandshakes(double number){
	          double numberOfHandshakes = (number *(number - 1))/2;
              return numberOfHandshakes;
        }
   
       public static void main(String[] args){
              Scanner input = new Scanner(System.in);
              System.out.print("Enter the Number of Students : ");
              double numberOfStudents = input.nextDouble();
              
              double numberOfHandshakes = MaximumHandshakes.calculatingMaximumHandshakes(numberOfStudents);
              System.out.print("The Maximum Number of Possible Handshakes is "+ numberOfHandshakes);
        }
}		
import java.util.Scanner;
public class SimpleInterest{

       // Creating Method for calculating Simple Interest
       public static double SI(double principal, double rate, double time ){
              double simpleInterest = principal * rate * time / 100;
              return simpleInterest;
                     }
       public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       // taking principal, rate of interest and time from user
       System.out.print("Enter the Principal amount: ");
       double principal = input.nextDouble();

       System.out.print("Enter the Rate of interest: ");
       double rate = input.nextDouble();

       System.out.print("Enter the Time: ");
       double time = input.nextDouble();

       // call the method to calculate the simple interest
       double simpleInterest = SimpleInterest.SI(principal, rate, time);
      
       System.out.println("The Simple Interest is "+ simpleInterest +" for Principal "+ principal +", Rate of Interest "+ rate +" % and Time "+ time);
       input.close();
       }
}

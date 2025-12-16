import java.util.Scanner;
class simple_interest{
      public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Calculating the simple interest");
      System.out.print("Enter the value of principal : ");
      float principal = sc.nextFloat();
      System.out.print("Enter the value of rate : ");
      float rate = sc.nextFloat();
      System.out.print("Enter the value of time : ");
      float time = sc.nextFloat();
      float simple_interest = (principal * rate * time) / 100;
      System.out.print("Simple Interest : " + simple_interest);
      }
}
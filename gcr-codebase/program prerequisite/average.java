import java.util.Scanner;
class average{
      public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number : ");
      float a = sc.nextFloat();
      System.out.print("Enter the second number :");
      float b = sc.nextFloat();
      System.out.print("Enter the third number :");
      float c = sc.nextFloat();
      float average = (a+b+c)/3;
      System.out.print("Average of three numbers is : " + average);
      }
}
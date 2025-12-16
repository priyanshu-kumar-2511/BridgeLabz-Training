import java.util.Scanner;
class convert_kilometers_to_miles{
      public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the distance : ");
      double kilometer = sc.nextDouble();
      double miles = kilometer * 0.621371;
      System.out.print("Miles : " + miles);
      }
}
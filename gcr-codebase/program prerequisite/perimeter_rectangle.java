import java.util.Scanner;
class perimeter_rectangle{
      public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the length of the rectangle : ");
      float length = sc.nextFloat();
      System.out.print("Enter the width of the rectangle :");
      float width = sc.nextFloat();
      float perimeter = 2 * (length + width);
      System.out.print("Perimeter of a Rectangle is " + perimeter);
      }
}
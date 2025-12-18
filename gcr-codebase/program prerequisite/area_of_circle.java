import java.util.Scanner;
class area_of_circle{
      public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.println("Calculating the area of a circle: ");

      System.out.print("Enter the radius of a circle : ");
      float radius = sc.nextFloat();

      float area = 3.14f * radius * radius;
      System.out.print("Area of a Circle is " + area);
     
      sc.close();
      }
}
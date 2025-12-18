import java.util.Scanner;
class areaOfTrinagle{
      public static void main(String[] args){
    
      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);
      
      // taking input from user
      System.out.print("Enter the base of a trinagle : ");
      double base = sc.nextDouble();
     
      System.out.print("Enter the height of a triangle : ");
      double height = sc.nextDouble();
      
      // calculating the area of a triangle in sq inchecs
      double areaOfTriangle = (1/2) * base * height;
      
      // calculating the area of a triangle in sq cm
      double baseInCm = base * 2.54;
      double heightInCm = height * 2.54;
      double areaOfTriangleInCm = (1/2) * baseInCm * heightInCm;
      
      // Displaying the result
      System.out.print("The Area of the triangle in sq in is " + areaOfTriangle + " and sq cm is " + areaOfTriangleInCm);
   
      sc.close();
      }
}
import java.util.Scanner;
class cylinder{
      public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Calculating the volume of a cylinder");
      System.out.print("Enter the radius of a cylinder : ");
      float radius = sc.nextFloat();
      System.out.print("Enter the height of a cylinder : ");
      float height = sc.nextFloat();
      float volume = 3.14f * radius * radius * height;
      System.out.print("Volume of a cylinder is " + volume);
      }
}
import java.util.Scanner;
class countDownUsingLoop{
      public static void main(String[] args){
     
      Scanner input = new Scanner(System.in);
      
      // taking a number from user for countdown
      System.out.print("Enter a number for countdown: ");
      int counter = input.nextInt();
     
      // displaying a number in countdown
      for(int i=counter; i>0; i--){
         System.out.println(i);
      }
      
      input.close();
      }
}
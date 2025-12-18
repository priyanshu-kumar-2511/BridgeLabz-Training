import java.util.Scanner;
class oddAndEven{
      public static void main(String[] args){

      Scanner input = new Scanner(System.in);
     
      // taking number from user
      System.out.print("Enter the number: ");
      int number = input.nextInt();

      // checking the number is even or odd
      for(int i=1;i<=number; i++){
          if(i%2==0){
            System.out.print("The "+ i +" is odd");
          }
          else{
            System.out.print("The "+ i+ " is even");
          }
        }    
      input.close();
      }
}
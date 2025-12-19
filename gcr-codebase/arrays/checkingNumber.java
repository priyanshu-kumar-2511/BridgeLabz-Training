import java.util.Scanner;
class checkingNumber{
      public static void main(String[] args){
 
      Scanner input = new Scanner(System.in);
      int [] number = new int[5];

      // taking user input
      for(int index =0; index < number.length; index++){
          System.out.print("Enter a number: ");
          number[index] = input.nextInt();

          // checking the number is positive, negative or zero
          if(number[index] > 0){

             // checking the number is even or odd
             if(number[index] % 2 == 0){
               System.out.println("The "+number[index] +" is even.");
             }
             else{
               System.out.println("The "+number[index] +" is odd.");      
             }
          }
          else if(number[index] == 0){
               System.out.println("The "+number[index] +" is zero.");
          }
          else{
               System.out.println("The "+number[index] +" is negative.");
          }
       }
       input.close();
    }
}

               
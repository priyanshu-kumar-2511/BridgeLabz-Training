import java.util.Scanner;
class totalPrice{
      public static void main(String [] args){
      
      // Creating Scanner object for taking input from user
      Scanner sc = new Scanner(System.in);
    
      // Taking input from user
      System.out.print("Enter the unit price of an item : ");
      int unitPrice = sc.nextInt();
      System.out.print("Enter the quantity you wants to buys : ");
      int quantity = sc.nextInt();
     
      // Calculating the total price
      int totalPrice = quantity * unitPrice;
     
      // Displaying the result
      System.out.print("The total purchase price is INR " + totalPrice +" if the quantity "+ quantity +" and unit price is INR "+ unitPrice);
      
       sc.close();
       }
}
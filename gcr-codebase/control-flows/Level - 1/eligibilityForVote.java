import java.util.Scanner;
class eligibilityForVote{
      public static void main(String[] args){
  
      Scanner input = new Scanner(System.in);
      
      // Taking age of a person from user
      System.out.print("Enter the age of a person: ");
      int age = input.nextInt();
 
      // Checking the person is eligible for vote or not
          if(age >= 18){
             System.out.print("The person's age is " + age + " and can vote.");
          }
          else{
               System.out.print("The person's age is " + age + " and cannot vote.");
          }
     input.close();
     }
}
      
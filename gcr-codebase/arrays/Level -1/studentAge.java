import java.util.Scanner;
class studentAge{
      public static void main(String [] args){
 
      Scanner input = new Scanner(System.in);
      
      // array age of size 10
      int [] age = new int[10];
      for (int i=0;i<age.length;i++){
      // taking age input from user and checking Is student is eligible for vote or not
          System.out.print("Enter the age of a student: ");
          age[i] = input.nextInt();
          if(age[i] >= 18){
             System.out.println("The student with the age "+ age[i]+" can vote.");
          }
          else{
              System.out.println("The student with the age "+ age[i] +" cannot vote.");
          }
       }
      input.close();
    }
}
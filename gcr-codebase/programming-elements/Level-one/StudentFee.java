import java.util.Scanner;
class StudentFee{
    public static void main(String[] args) {
        
        // Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
       
        // Taking user fee and discount percent as a input
        System.out.print("Enter the Student Fee : ");
        int fee = sc.nextInt();
        System.out.print("Enter the Discount Percent : ");
        int discount_percent = sc.nextInt();

         
        int discount = (fee * discount_percent) / 100;
        int final_fee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + final_fee);
        sc.close();
    }
}
import java.util.Scanner;
class employeeBonus{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // taking salary and year from user
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // calculating the bonus if the year is more than 5
        double bonus = 0.0;

        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus amount is: " + bonus);

        sc.close();
    }
}
import java.util.Scanner;
class EmployeeBonusWithSalary{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int totalEmployees = 10;

        double[] salary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // taking input from user
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double sal = input.nextDouble();

            System.out.print("Enter Years of Service: ");
            double yrs = input.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input!");
                i--; 
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        // Calculating the bonus and updating the new salary
        for (int i = 0; i < totalEmployees; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        //Displaying the results
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);

        input.close();
    }
}

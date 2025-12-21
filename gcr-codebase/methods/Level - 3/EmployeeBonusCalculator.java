public class EmployeeBonusCalculator {

    // creating method to generate salary and years of service
    public static double[][] generateData(int size) {
        double[][] data = new double[size][2];

        for (int i = 0; i < size; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5 digit salary
            data[i][1] = (int)(Math.random() * 10) + 1;       // years of service
        }
        return data;
    }

    // creating method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][1] = bonus;
            result[i][0] = salary + bonus;
        }
        return result;
    }

    // creating method to display salary and total bonus details
    public static void displayResult(double[][] oldData, double[][] newData) {

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp  OldSalary  Years   Bonus  NewSalary");

        for (int i = 0; i < oldData.length; i++) {

            totalOld += oldData[i][0];
            totalBonus += newData[i][1];
            totalNew += newData[i][0];

            System.out.printf("%d     %.0f      %.0f      %.0f     %.0f\n", i + 1, oldData[i][0], oldData[i][1], newData[i][1], newData[i][0]);
        }

        System.out.println("--------------------------------------");
        System.out.println("Total Old Salary : " + totalOld);
        System.out.println("Total Bonus      : " + totalBonus);
        System.out.println("Total New Salary : " + totalNew);
    }

    // main method
    public static void main(String[] args) {

        int employees = 10;

        // method call 1
        double[][] employeeData = generateData(employees);

        // method call 2
        double[][] updatedData = calculateBonus(employeeData);

        // method call 3
        displayResult(employeeData, updatedData);
    }
}

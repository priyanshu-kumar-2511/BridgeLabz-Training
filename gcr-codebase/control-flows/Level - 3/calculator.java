import java.util.Scanner;
class calculator{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double firstNumber, secondNumber;
        String operator;

        // taking user input
        System.out.print("Enter first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        secondNumber = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next();

        // calculating using switch-case
        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;

            case "-":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;

            case "*":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;

            case "/":
                if (secondNumber != 0) {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}

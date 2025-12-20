import java.util.Scanner;
public class RemainderAndQuotientChocolates{
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChild){
     	int numberOfChocolatesEachChild = numberOfChocolates/numberOfChild;
		int numberOfChocolatesLeft = numberOfChocolates%numberOfChild;
		return new int[] {numberOfChocolatesEachChild, numberOfChocolatesLeft};
	}
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Number of Chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        System.out.print("Enter a Number of Child: ");	
        int numberOfChild = input.nextInt();

        int []result = findRemainderAndQuotient(numberOfChocolates, numberOfChild);		
		System.out.println("Number of Chocolates to Each Child is "+ result[0]);
		System.out.println("Number of Remaining Chocolates is "+ result[1]);
		
		input.close();
	}
}	
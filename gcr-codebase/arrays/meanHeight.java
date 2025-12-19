import java.util.Scanner;
class meanHeight{
    public static void main(String [] args){
	   
	Scanner input = new Scanner(System.in);
      
    int number = 11;
	System.out.println("Number of player is: "+ number);
	double sum = 0;
	  
	double [] height = new double[number];
	for(int index =0; index < number; index++){
		System.out.println("Enter the height of the player: ");
	    height[index] = input.nextDouble();
		sum += height[index];
	    }
    double means = sum/number;
	System.out.print("The means height of players present in the football team is "+ means);
	}
}	
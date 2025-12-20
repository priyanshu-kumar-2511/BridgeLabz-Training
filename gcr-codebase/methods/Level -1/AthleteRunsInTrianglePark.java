import java.util.Scanner;
public class AthleteRunsInTrianglePark{
       public static int numberOfRound(int side1, int side2, int side3){
	         int perimeterOfTriangle = side1 + side2 + side3;
			   int distanceInKm = 5;
            int distanceInM	= distanceInKm * 1000;
			   int numberOfRound = distanceInM/perimeterOfTriangle;
              if(distanceInM%perimeterOfTriangle == 0){
                 return numberOfRound;
              } else {
                 return numberOfRound +=1;
              }
        }
       
        public static void main(String[] args){
               Scanner input = new Scanner(System.in);
               System.out.println("Enter the Sides of a Triangle : ");
               int side1 = input.nextInt();
               int side2 = input.nextInt();
               int side3 = input.nextInt();
               
               int numberOfRound = AthleteRunsInTrianglePark.numberOfRound(side1, side2, side3);
               System.out.print("The Number of Rounds needs to do to complete 5km run is " + numberOfRound);
			   
			   input.close();
        }
}		
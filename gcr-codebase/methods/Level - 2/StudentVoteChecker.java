import java.util.Scanner;
public class StudentVoteChecker{
       
	// creating method to check voting eligibility
	public boolean canStudentVote(int age){
	    if(age < 18){
            return false;
        }
        else{
             return true;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		
		StudentVoteChecker checker = new StudentVoteChecker();
		int[] ages = new int[10];
		
		System.out.println("Enter age of 10 students: ");
		
		for(int i=0; i<ages.length;i++){
		    System.out.print("Enter age of student " +(i+1)+": ");
			ages[i] = input.nextInt();
			
			boolean canVote = checker.canStudentVote(ages[i]);
			
			if(canVote){
			   System.out.println("Student " +(i+1) + " can vote.");
			} else {
			   System.out.println("Student " +(i+1) +" cannot vote.");
			}
        }
		input.close();
    }
}	
		
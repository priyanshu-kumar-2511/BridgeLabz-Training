import java.util.Scanner;
public class ComparingTwoString{
        // creating method for comparing the two string using charAt 
	    public static boolean compareUsingCharAt (String str1 , String str2){
	        if(str1.length() != str2.length()){
			    return false;
			}
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        
        public static void main(String [] args){
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a first string : ");
            String firstString = input.next();
 
            System.out.print("Enter a second string : ");
            String secondString = input.next();

            // Compare strings using the charAt() method
            boolean resultUsingCharAt = compareUsingCharAt(firstString, secondString);

            // Compare strings using the built-in equals() method
            boolean resultUsingEquals = firstString.equals(secondString);

            // Displaying the results
            System.out.println("Comparison using charAt(): " + resultUsingCharAt);
            System.out.println("Comparison using equals(): " + resultUsingEquals);

            if (resultUsingCharAt == resultUsingEquals) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("The methods give different results.");
            }
		
        input.close();
        }
} 		
		
			
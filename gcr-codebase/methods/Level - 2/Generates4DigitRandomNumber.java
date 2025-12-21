import java.util.Arrays;

public class Generates4DigitRandomNumber{

    // creating an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    // finding average, minimum, and maximum of an array
    public static double[] findAverageMinMax(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args){
	
	    // calling method to store 5 number of 4digit 
        int[] randomNumbers = generate4DigitRandomArray(5);

        // calling method to find average, min and max number
        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("Random Numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + (int) result[1]);
        System.out.println("Maximum: " + (int) result[2]);
		
    }
}

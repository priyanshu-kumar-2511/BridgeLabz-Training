import java.util.Arrays;

public class OTPGenerator {

    // creating method to generate a 6-digit OTP number
    public static int generateOTP() {
        // generates number from 100000 to 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // creating method to check whether all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otpArray = new int[10];

        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        boolean isUnique = areOTPsUnique(otpArray);

        System.out.println("Are all OTPs unique: " + isUnique);
    }
}

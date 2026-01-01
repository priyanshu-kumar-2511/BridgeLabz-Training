/*
Given a signed 32-bit integer x, 
return x with its digits reversed. 
If reversing x causes the value to go 
outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
*/

class ReverseInteger {
   
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Check overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }
        return rev;
    }
}

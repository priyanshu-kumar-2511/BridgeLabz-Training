package com.regex.validateipaddress;

/*10. Validate an IP Address
A valid IPv4 address consists of four groups of numbers (0-255) separated by dots.
*/
import java.util.Scanner;

public class IPv4Validator {

    public static boolean isValidIP(String ip) {

        String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"
                     + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        return ip.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String ip = sc.nextLine();

        if (isValidIP(ip)) {
            System.out.println("Valid IPv4 address");
        } else {
            System.out.println("Invalid IPv4 address");
        }

        sc.close();
    }
}


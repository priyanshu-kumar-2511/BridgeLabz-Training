package functionalinterface.supplier;

/*Scenario 4: Supplier (Provide Data)

1.Generate OTP using Supplier.

2.Generate random student ID using Supplier.

3.Provide current date and time using Supplier.

4.Provide default welcome message using Supplier.

5.Generate random discount coupon using Supplier.*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierScenario {

    public static void main(String[] args) {
        Random random = new Random();

        /* 1️ Generate OTP using Supplier */

        Supplier<String> otpGenerator = () -> { int otp = 100000 + random.nextInt(900000);
            return String.valueOf(otp);
        };
        System.out.println("Generated OTP: " + otpGenerator.get());

        /* 2️ Generate random student ID */

        Supplier<String> studentIdGenerator = () -> "STU" + (1000 + random.nextInt(9000));
        System.out.println("Generated Student ID: " + studentIdGenerator.get());

        /* 3️ Provide current date and time */

        Supplier<String> dateTimeSupplier = () ->LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println("Current Date & Time: " + dateTimeSupplier.get());

        /* 4️ Provide default welcome message */

        Supplier<String> welcomeMessage = () -> "Welcome to Smart City Transport System!";
        System.out.println(welcomeMessage.get());

        /* 5️ Generate random discount coupon */

        Supplier<String> couponGenerator = () -> "DISC-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        System.out.println("Generated Coupon Code: " + couponGenerator.get());

        /* BONUS: Supplier executed multiple times */

        System.out.println("\nMultiple OTPs:");
        for (int i = 0; i < 3; i++) {
            System.out.println(otpGenerator.get());
        }
    }
}

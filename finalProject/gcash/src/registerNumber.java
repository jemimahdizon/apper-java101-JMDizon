import java.util.Map;
import java.util.Scanner;

public class registerNumber {
    public static void registerNumber(Scanner scanner, Map<String, Double> balances, Map<String, String> users) {
        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine().trim(); // Use nextLine() and trim()

        // Check if the mobile number is already registered
        if (users.containsKey(mobileNumber)) {
            System.out.println("Mobile number already registered!");
            return;
        }

        // Check if the mobile number is empty or blank
        if (mobileNumber.isEmpty()) { // Only check for empty input
            System.out.println("Mobile number must not be empty!");
            return;
        }

        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim(); // Use nextLine() and trim()

        // Check if the name is empty or blank
        if (name.isEmpty()) { // Only check for empty input
            System.out.println("Name must not be empty!");
            return;
        }

        // Register the mobile number with the name and default balance of 100.00
        users.put(mobileNumber, name);
        balances.put(mobileNumber, 100.00);
        System.out.println("Mobile number registered successfully!");
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainMenu {
    private static Map<String, Double> balances = new HashMap<>();
    private static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize with 5 registered users
        registerUser("09175861661", "Bob", 100.00);
        registerUser("09175861662", "Marley", 100.00);
        registerUser("09175861663", "Seth", 100.00);
        registerUser("09175861664", "Ryan", 100.00);
        registerUser("09175861665", "Fritz", 100.00);

        while (true) {
            System.out.println("Welcome to Gcash Share-A-Load1!");
            System.out.println("1. Register a number");
            System.out.println("2. Share load");
            System.out.println("3. Check balances");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerNumber.registerNumber(scanner, balances, users);
                    break;
                case 2:
                    shareLoad.shareLoad(scanner, balances, users);
                    break;
                case 3:
                    currentBalance.checkCurrentBalance(balances, users);
                    break;
                case 4:
                    System.out.println("Thank you for using SIM Application. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    // Helper method to register a user
    private static void registerUser(String mobileNumber, String name, double balance) {
        users.put(mobileNumber, name);
        balances.put(mobileNumber, balance);
    }
}

import java.util.Map;
import java.util.Scanner;

public class shareLoad {
    public static void shareLoad(Scanner scanner, Map<String, Double> balances, Map<String, String> users) {
        System.out.print("Enter sender's mobile number: ");
        String sender = scanner.nextLine().trim();

        // Check if the sender's mobile number is empty or not registered
        if (sender.isEmpty() || !users.containsKey(sender)) {
            System.out.println("Sender's mobile number is not valid or not registered!");
            return;
        }

        System.out.print("Enter recipient's mobile number: ");
        String recipient = scanner.nextLine().trim();

        // Check if the recipient's mobile number is empty or not registered
        if (recipient.isEmpty() || !users.containsKey(recipient)) {
            System.out.println("Recipient's mobile number is not valid or not registered!");
            return;
        }

        // Check if the sender and recipient are the same
        if (sender.equals(recipient)) {
            System.out.println("Sender and recipient cannot be the same!");
            return;
        }

        System.out.print("Enter amount to share: ");
        double amount;

        // Check if the amount input is valid
        if (scanner.hasNextDouble()) {
            amount = scanner.nextDouble();
        } else {
            System.out.println("Invalid amount!");
            return;
        }

        // Check if the amount is valid
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        // Check if the sender has sufficient balance
        if (balances.get(sender) < amount) {
            System.out.println("Insufficient balance for the sender!");
            return;
        }

        // Perform the load sharing by updating the balances
        balances.put(sender, balances.get(sender) - amount);
        balances.put(recipient, balances.get(recipient) + amount);

        String senderName = users.get(sender);
        String recipientName = users.get(recipient);
        System.out.println(senderName + " successfully shared " + amount + " to " + recipientName + "!");
    }
}

import java.util.Map;

public class currentBalance {
    public static void checkCurrentBalance(Map<String, Double> balances, Map<String, String> users) {
        System.out.println("Current Balances:");
        for (Map.Entry<String, Double> entry : balances.entrySet()) {
            String mobileNumber = entry.getKey();
            String name = users.get(mobileNumber);
            double balance = entry.getValue();
            System.out.println("Mobile Number: " + mobileNumber + ", Name: " + name + ", Balance: " + balance);
        }
    }
}

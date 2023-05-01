import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wantsToContinue = true;
        
        // loop to allow the user to enter multiple integers
        while (wantsToContinue) {
            int num = 0;
            boolean isInteger = false;

            // loop to prompt the user for an integer input, and keep asking until a valid integer is entered
            while (!isInteger) {
                System.out.print("Enter an integer: ");
                if (scanner.hasNextInt()) { // check if the input is an integer
                    num = scanner.nextInt();
                    isInteger = true; // set isInteger to true to exit the loop
                } else {
                    System.out.println("Please input an integer."); // if input is not an integer, display error message
                    scanner.next(); // clear the input buffer
                }
            }

            // call the isPrimeNumber method to determine if the input is a prime number
            boolean isPrime = isPrimeNumber(num);
            System.out.println(num + " is a prime number? " + isPrime);

            // prompt the user to continue or exit the program
            System.out.print("Do you want to enter another number? (Y/N) ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("N")) { // if user enters "N", exit the loop
                wantsToContinue = false;
            }
        }
    }

    /**
     * Determines whether a given integer is a prime number.
     *
     * @param num the integer to check
     * @return true if the input is a prime number, false otherwise
     */
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) { // numbers less than or equal to 1 are not prime
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // check if num is divisible by any integers from 2 to sqrt(num)
            if (num % i == 0) { // if num is divisible by i, it is not a prime number
                return false;
            }
        }
        return true; // if num is not divisible by any integers from 2 to sqrt(num), it is a prime number
    }
}


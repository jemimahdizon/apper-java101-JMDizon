public class OddEven {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};

        // Declare two integer variables to keep track of the number of odd and even numbers
        int oddCount = 0;
        int evenCount = 0;

        // Iterate through the array using a for-each loop
        for (int num : nums) {
            // Call the isEven() method to determine whether the number is even or odd
            if (isEven(num)) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the counts of odd and even numbers
        System.out.println("Odd: " + oddCount);
        System.out.println("Even: " + evenCount);
    }


    // Method that takes an integer and returns true if it is even, false otherwise.
    public static boolean isEven(int num) {
        // Return true if the number is even (i.e., its remainder when divided by 2 is 0), false otherwise
        return num % 2 == 0;
    }
}


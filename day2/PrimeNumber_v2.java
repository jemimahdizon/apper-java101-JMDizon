import java.util.Scanner;

public class PrimeNumber_v2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 10000000: ");
        int n = scanner.nextInt();
        
        if (n < 1 || n > 10000000) {
            System.out.println("Invalid input. Please enter a number between 1 to 10000000.");
            return;
        }
        
        // Simple test using division by square-root of number
        long startTime = System.nanoTime();
        boolean isPrimeSimple = isPrimeSimple(n);
        long endTime = System.nanoTime();
        long durationSimple = (endTime - startTime);
        System.out.println("Is prime (simple): " + isPrimeSimple + ", Duration: " + durationSimple + " ns");
        
        // Miller-Rabin primality test
        startTime = System.nanoTime();
        boolean isPrimeMR = isPrimeMR(n);
        endTime = System.nanoTime();
        long durationMR = (endTime - startTime);
        System.out.println("Is prime (Miller-Rabin): " + isPrimeMR + ", Duration: " + durationMR + " ns");
    }
    
    // Simple test using division by square-root of number
    public static boolean isPrimeSimple(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Miller-Rabin primality test
    public static boolean isPrimeMR(int n) {
        if (n <= 1 || (n > 2 && n % 2 == 0)) {
            return false;
        }
        
        int[] bases = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        
        int r = 0;
        int d = n - 1;
        while (d % 2 == 0) {
            r++;
            d /= 2;
        }
        
        for (int base : bases) {
            if (!witness(base, d, r, n)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean witness(int a, int d, int r, int n) {
        long x = modPow(a, d, n);
        if (x == 1 || x == n - 1) {
            return true;
        }
        for (int i = 1; i < r; i++) {
            x = (x * x) % n;
            if (x == n - 1) {
                return true;
            }
        }
        return false;
    }
    
    public static long modPow(long x, long y, long m) {
        if (y == 0) {
            return 1;
        }
        long p = modPow(x, y / 2, m) % m;
        p = (p * p) % m;
        if (y % 2 == 0) {
            return p;
        } else {
            return (x * p) % m;
        }
    }
}


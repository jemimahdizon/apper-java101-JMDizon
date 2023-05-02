import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        
        // while loop
        int ctr = 0;
        while (ctr < 10) {
            ctr = ctr + 1;
            System.out.println(ctr);
        }
//        System.out.println("========");
//
//        int ctr1 = 0;
//        while (ctr1 < 10) {
//            System.out.println(ctr1++);
//            //know the difference: ctr1++ and ++ctr1
//        }

        // do while loop
        do {
            System.out.println("wooohoo");
        } while (false);
        //for loop
//        while (ctr < 10) {
//            ctr = ctr + 1;
//            System.out.println(ctr);
//        }
        System.out.println("++++++++");
        for (int ctr2 = 1; ctr2 <= 10; ctr2++) {
            System.out.println(ctr2);
        }
        
        //other example of do-while loop
        //loop until desired input (1-3) is inputted
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            System.out.print("Enter your choice (1-3): ");
            userChoice = scanner.nextInt();
        } while (userChoice < 1 || userChoice > 3);

        System.out.println("You chose option " + userChoice);

    }
}

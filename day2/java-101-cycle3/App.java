public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // How to name a variable
            // start with a letter or an underscore
                //example:
                int quantity = 9;
                int _quantity = 9;
                int _quantity2121213121212_____ = 9;
                // int 9quantity = 9; // INVALID
                // int **?/quantity = 9; // INVALID
                System.out.println(_quantity2121213121212_____);

            // use camelCase always
                // example:
                double myGrade = 89.9;
                String myNickname = "Mai";
                System.out.println(myGrade);
                System.out.println(myNickname);

            // Except for static variables (will discuss soon)
                // example:
                // double MY_GRADE = 89.9;

        //Variables
            // it holds a value,
            // it stores in RAM
        //example:
        int age = 15;

        // numeric whole number data types: short, int, long
        System.out.println(age);

        age = age + 10;
        System.out.println(age);

        long myBalanceInGcash = 1000000000;
        //int newBalance = myBalanceInGcash + age;
            // will not work since "long" has a bigger data type, it should have same byte.
        long newBalance = myBalanceInGcash + age; //NOTE: newBalance should not be int
        System.out.println(newBalance);

        //decimal: double and float
        allAboutDecimals(age);

        //Strings
        allAboutStrings();

    }

    public static void allAboutDecimals(int age) {
        double price = 4.45;
        double newPrice = price + age;
        System.out.println(newPrice);

        float discount = 9.56f;
        double subtotal = newPrice + discount;
        System.out.println(subtotal);

        double num1 = 1;
        float num2 = 4000.54f;
        double result = num1 + num2;
        System.out.println(result);

        int resultMaxValue = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(resultMaxValue);
    }

    public static void allAboutStrings() {
        int number1 = 1;
        char number1char = '1';
        String number1string = "1"; // array of characters ['1', '', '', ....]
        // size depends on the number of letter ( mai(3 letters) ---> 3 x 16bytes (size))

        String myName = "Mai"; //use this
        char[] myNameArr = new char[]{'M', 'A', 'I'}; //over this

        System.out.println(myName);
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());
        String completeName = myName + " Dizon";
        System.out.println(completeName);
        System.out.println(myName.substring(2, 3));

        boolean isEqualName = myName.equals("mai");
        boolean isEqualIgnoreCase = myName.equalsIgnoreCase("mai");
        System.out.println(isEqualName + " " + isEqualIgnoreCase);
    }

}

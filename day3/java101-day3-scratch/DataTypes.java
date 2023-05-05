public class DataTypes {

    // Zero value
    static int age;
    static double salary;
    static boolean isHappy;
    static char favoriteLetter;
    static float weight;
    static long distance;

    // Wrapper classes
    static Integer wrapperAge;
    static Boolean wrapperIsHappy;

    public static void main(String[] args) {
        System.out.println(age); // 0
        System.out.println(salary); // 0.0
        System.out.println(isHappy); // False
        System.out.println(favoriteLetter); // ""
        System.out.println(weight);// 0.0
        System.out.println(distance);// 0

        System.out.println(age + " " + wrapperAge);
        System.out.println(isHappy + " " + wrapperIsHappy);

        System.out.println(age + 10);
        // System.out.println(wrapperAge + age);

        // error because theAge is null:
        // Integer theAge = 10;
        // System.out.println(theAge);

        // theAge = theAge + 89;

        System.out.println("+++++");

        // Pass by value
        Integer theAge = 100;
        System.out.println(theAge);
        displayAgeInAFancyWay(theAge);

        System.out.println("Value of theAge after calling fancy method: " + theAge);

        System.out.println("+++++");

        // Pass by reference
        Integer[] ages = new Integer[]{100};
        System.out.println(ages[0]);
        displayAgeInAFancyWay(ages);

        System.out.println("Value of theAge after calling fancy method: " + ages[0]);

        // Primitive to wrapper
        int numUsers = 101;
        Integer numberOfUsers = numUsers;

        System.out.println(numberOfUsers.intValue());

        System.out.println("+++++");
        int a = 9;
        int b = 10;
        int c = 78;

        System.out.println(c % 4);
        System.out.println((a + b) * c % 4);

        System.out.println(c++ + " " + ++a);
        System.out.println(c);
    }

    //since Integer is an immutable class, changes made to the Integer object in the method will not be reflected outside of the method when passed by value
    static void displayAgeInAFancyWay(Integer age) {
        System.out.println("Fancy! " + age);
        age = age + 100;
    }

    static void displayAgeInAFancyWay(Integer[] age) {
        System.out.println("Fancy! " + age[0]);
        age[0] = age[0] + 100;
    }
}

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get animal details from user
        System.out.println("Enter animal name:");
        String animalName = scanner.nextLine();

        System.out.println("Enter animal type:");
        String animalType = scanner.nextLine();

        System.out.println("Enter kind of food the animal eats:");
        String animalFood = scanner.nextLine();

        System.out.println("Enter what sound does the animal make:");
        String animalSound = scanner.nextLine();

        Animals animal = new Animals(animalName, animalType, animalFood, animalSound);

        // Get visitor details from user
        System.out.println("Enter visitor name:");
        String visitorName = scanner.nextLine();

        System.out.println("Enter visitor age:");
        int visitorAge = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        Visitor visitor = new Visitor(visitorName, visitorAge);

        // Get employee details from user
        System.out.println("Enter employee name:");
        String employeeName = scanner.nextLine();

        System.out.println("Enter employee salary:");
        double employeeSalary = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        Employee employee = new Employee(employeeName, employeeSalary);

        // Get manager details from user
        System.out.println("Enter manager name:");
        String managerName = scanner.nextLine();

        System.out.println("Enter manager age:");
        int managerAge = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter manager initial title:");
        String managerTitle = scanner.nextLine();

        Manager manager = new Manager(managerName, managerAge, managerTitle);

        // Print all the details
        System.out.println("The animal's name is: " + animal.getName() + ". It is a " + animal.getType() + ", and it eats " + animal.getFood() + ". It makes a " + animal.produceSound() + " noise!");
        System.out.println("Visitor's name is " + visitor.getName() + " and their age is " + visitor.getAge()  + " years old.");
        System.out.println("Employee: " + employee.getName() + ", Salary: " + employee.getSalary());
        System.out.println("Manager: " + manager.getName() + ", " + manager.getAge() + " years old, and has the position " + manager.getTitle());
    }
}

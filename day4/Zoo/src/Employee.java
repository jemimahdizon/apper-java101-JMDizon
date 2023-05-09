public class Employee {
    private String name;
    private double salary;
    private Animals assignedAnimal;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void setAssignedAnimal(Animals animal) {
        assignedAnimal = animal;
    }
    public void feedAnimal() {
        if (assignedAnimal != null) {
            System.out.println(name + " is feeding " + assignedAnimal.getName());
            assignedAnimal.chewFood();
            assignedAnimal.produceSound();
        } else {
            System.out.println(name + " has no assigned animal to feed.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

import blueprint.Person;

public class App {
    public static void main(String[] args) {
        Person mai = new Person();
        mai.age = 23;
        mai.name = "Mai Dizon";
        mai.isMale = false;
        mai.relationshipStatus = "single";
        mai.citizenship = "09123456789";

        System.out.println(mai.getNameWithPrefix());
        mai.getJob();
    }
}

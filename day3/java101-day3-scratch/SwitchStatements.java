public class SwitchStatements {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        animalSound(String.valueOf(animal).toLowerCase());
    }

    public static void animalSound(String animal) {
        switch (animal) {
            case "dog":
                System.out.println("arf arf");
                break;
            case "cat":
                System.out.println("meow");
                break;
            case "goat":
                System.out.println("meeeehhh");
                break;
            case "cow":
                System.out.println("mooo");
                break;
            default:
                System.out.println("Yehey!");
        }
    }

    public enum Animal {
        DOG, CAT, GOAT, COW
    }
}

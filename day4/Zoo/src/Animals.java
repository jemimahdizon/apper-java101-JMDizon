public class Animals {
    private String name;
    private String type;
    private String food;
    private String sound;

    public Animals(String name, String type, String food, String sound) {
        this.name = name;
        this.type = type;
        this.food = food;
        this.sound = sound;
    }

    public String produceSound() {
        return sound;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getFood() {
        return food;
    }

    public void chewFood() {
        // Code to simulate the animal chewing its food
    }
}

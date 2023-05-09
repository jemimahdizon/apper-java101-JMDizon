public class Manager {
    private String name;
    private int age;
    private String title;

    public Manager(String name, int age, String title) {
        this.name = name;
        this.age = age;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }
}

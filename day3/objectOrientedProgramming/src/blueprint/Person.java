package blueprint;

public class Person {
    public String name;
    public int age;
    double weight;
    String contactNumber;
    public boolean isMale;
    double height;
    String birthDate;
    public String citizenship;
    String address;
    public String relationshipStatus;
    String eyeColor;
    String religion;
    String email;
    String birthplace;
    String occupation;
    boolean hasSiblings;
    String ethnicity;

    public Person() {
    }

    public String getNameWithPrefix() {
        String prefix = "MR. ";
        if (!this.isMale) {
            if (this.relationshipStatus.equals("single")) {
                prefix = "MS. ";
            } else {
                prefix = "MRS. ";
            }
        }

        return prefix + this.name;
    }

    public void getJob() {
        System.out.println("Searching LinkedIn...");
    }
}

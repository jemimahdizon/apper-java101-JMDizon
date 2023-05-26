public class TopicInterface {
    public static void main(String[] args) {
        Blueberry blueberry = new Blueberry();

        // if blueberry is a cake, slice blueberry
        if (blueberry instanceof Cake) {
            // interface implementation
            blueberry.slice();
        }
    }
}

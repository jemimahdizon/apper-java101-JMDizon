import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("c1", "Innova");
        cars.put("c2", "FJ Cruiser");
        cars.put("c3", "Expander");
        //cars.put("c3", "Toyota");
        cars.put("c4", "Vios");
        cars.put("c5", "Honda");
        cars.put("c6", "Prius");

        System.out.println(cars.get("c4"));
        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.containsKey("c7"));
        System.out.println(cars.containsValue("Vios"));
        //not good practice
        //value can be repeated
        System.out.println(cars.values());


    }
}
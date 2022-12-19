import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> cities = new HashMap<String, String>();

        cities.put("Australia", "Sydney");
        cities.put("England", "London");

        for (String i : cities.keySet()) {
            System.out.println("Key: " + i + " Value: " + cities.get(i));
        }
    }
}

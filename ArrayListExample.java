import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList <String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Nissan");

        System.out.println("ArrayList: " + cars);
        System.out.println("ArrayList first element: " + cars.get(0));

        cars.set(0, "Toyota");
        System.out.println("ArrayList change first element: " + cars);

        cars.remove(0);
        System.out.println("ArrayList remove first element: " + cars);

        cars.clear();
        System.out.println("ArrayList clear all element: " + cars);
    }
}

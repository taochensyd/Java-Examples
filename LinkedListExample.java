import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Toyota");
        cars.add("Volvo");
        cars.add("BMW");
        System.out.println("LinkedList: " + cars);

        cars.addFirst("Mazda");
        System.out.println("LinkedList added to first element: " + cars);

        cars.addLast("Ford");
        System.out.println("LinkedList added to last element: " + cars);

        System.out.println("LinkedList remove last element: " + cars.getFirst());

        System.out.println("LinkedList remove last element: " + cars.getLast());

        cars.removeFirst();
        System.out.println("LinkedList remove first element: " + cars);

        cars.removeLast();
        System.out.println("LinkedList remove last element: " + cars);
    }
}

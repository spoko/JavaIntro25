package linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add(0, "Opel");
        cars.add("VW");

        System.out.println("Cars before selling are: " + cars);

        cars.remove("VW");
        cars.remove(0);

        System.out.println("Cars after selling are: " + cars);
    }
}

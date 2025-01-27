package stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> kitchenDrawer = new Stack<>();

        kitchenDrawer.push("Pan");
        kitchenDrawer.push("Dish");
        kitchenDrawer.push("Fork");

        System.out.println(kitchenDrawer);
        System.out.println(kitchenDrawer.pop());
        System.out.println(kitchenDrawer);

        kitchenDrawer.add(0, "Towel"); //this is not normal stack operation. This is a list operation

        System.out.println(kitchenDrawer);
    }
}

package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("First Person");
        queue.offer("Second Person");
        queue.offer("Third Person");
        queue.offer("Fourth Person");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

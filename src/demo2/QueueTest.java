package demo2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<>();
        names.offer("Jan");
        names.offer("Maria");
        names.offer("Wojciech");
        names.offer("Adrianna");

        String name1 = names.peek();
        System.out.println(name1);
        String name2 = names.poll();
        System.out.println(name2);
        String name3 = names.poll();
        System.out.println(name3);
    }
}

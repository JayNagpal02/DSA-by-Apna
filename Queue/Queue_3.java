package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Normal / Simple / Linear Queue implementation
 * using Collection Framework
 * using LinkedList
 */

public class Queue_3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}

package Queue;

import java.util.Stack;

/**
 * Queue implementation
 * using 2 Stack
 */

public class Queue_5 {
    static class Queue {
        static Stack<Integer> stack1 = new Stack<Integer>();
        static Stack<Integer> stack2 = new Stack<Integer>();

        public static boolean isEmpty() {
            return stack1.isEmpty();
        }

        public static void add(int data) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(data);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        public static int remove() {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.pop();
        }

        public static int peek() {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.peek();
        }
    }

    public static void main(String[] args) {
        Queue_5.Queue queue = new Queue();
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

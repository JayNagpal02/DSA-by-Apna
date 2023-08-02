package Stack;

import java.util.Stack;

public class Pgm01 {
    // Push at the Bottom of the stack
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        pushAtBottom(stack, data);
        stack.push(temp);
        return;
    }

    // Reverse the stack
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        reverse(stack);
        pushAtBottom(stack, temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        // pushAtBottom(stack, 5);
        // pushAtBottom(stack, 6);
        reverse(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}

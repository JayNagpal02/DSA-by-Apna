package Stack;

/**
 * stack implementation
 * using Linked List
 * using my method
 */

public class Stack_0 {
    Node top;
    private int size;

    Stack_0() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void push(String data) {
        Node temp = new Node(data);
        if (top == null) {
            top = temp;
            System.out.println(data + " pushed");
            return;
        }
        temp.next = top;
        top = temp;
        System.out.println(data + " pushed");
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        String temp = top.data;
        top = top.next;
        size--;
        System.out.println(temp + " popped");
    }

    public String peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }

    public void printStack() {
        if (top == null) {
            System.out.println("[]");
            return;
        }
        Node temp = top;
        System.out.print("[");
        while (temp != null) {
            if (temp.next != null)
                System.out.print(temp.data + ", ");
            else
                System.out.print(temp.data + "");
            temp = temp.next;
        }
        System.out.print("]\n");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Stack_0 stack = new Stack_0();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println(stack.peek() + " is at top of stack");
        stack.printStack();
        System.out.println("Size of stack is : " + stack.getSize());
    }
}

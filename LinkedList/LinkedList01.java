package LinkedList;

public class LinkedList01 {
    Node head;
    private int size;

    LinkedList01() {
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

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    // print
    public void printLinkedList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.print("null\n");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    // get size of list
    public int getSize() {
        return size;
    }

    // reverse the list
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            // update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public Node removeNthFromEnd(Node head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        Node currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        Node prevNode = head;
        int i = 1;
        while (i < indexToSearch) {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;
    }

    public Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node middle = findMiddle(head); // 1st half ka end
        Node secondHalfStart = reverseRecursive(middle.next); // 2st half ka start

        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    public static boolean hasCycle(Node head) {
        Node hare = head;
        Node turtle = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (turtle == hare) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // LinkedList01 list = new LinkedList01();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printLinkedList();

        // list.addLast("list");
        // list.printLinkedList();

        // list.addFirst("this");
        // list.printLinkedList();

        // list.deleteFirst();
        // list.printLinkedList();

        // list.deleteLast();
        // list.printLinkedList();

        // System.out.println(list.getSize());

        // list.addFirst("this");
        // list.printLinkedList();
        // System.out.println(list.getSize());

        // list.reverseIterate();
        // list.printLinkedList();

        // list.head = list.reverseRecursive(list.head);
        // list.printLinkedList();

        // list.removeNthFromEnd(list.head, 2);
        // list.printLinkedList();

        LinkedList01 list2 = new LinkedList01();
        list2.addLast("1");
        list2.addLast("2");
        list2.addLast("2");
        list2.addLast("1");
        System.out.println(list2.isPalindrome(list2.head));

        System.out.println(hasCycle(list2.head));
    }
}
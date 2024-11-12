public class LinkedListStack {
    private static Node top;

    // Node class for linked list
    private static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public LinkedListStack() {
        top = null;
    }

    // Check if stack is empty
    public static boolean isEmpty() {
        return top == null;
    }

    // Push value onto the stack
    public static void push(char val) {
        Node temp = new Node(val);
        temp.next = top;
        top = temp;
    }

    // Pop value from the stack
    public static char pop() {
        if (!isEmpty()) {
            char val = top.data;
            top = top.next;
            return val;
        } else {
            return 'e';
        }
    }

    // Peek at the top value without removing it
    public static char peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            return 'e';
        }
    }
}

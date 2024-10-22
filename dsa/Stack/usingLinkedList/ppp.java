package dsa.Stack.usingLinkedList;

public class ppp {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head;

        static boolean isEmpty() {
            return head == null;
        }

        static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                newNode = head;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack.push(2);
        Stack.push(3);
        Stack.push(5);
        Stack.push(8);
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
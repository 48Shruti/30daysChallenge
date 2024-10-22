package dsa.Queue.usingArray;

/**
 * edf
 */

import java.util.Queue;

public class edf {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        static void add(int data) {
            if (arr[size] == rear - 1) {
                System.out.println("full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int front = 0;
            arr[rear] = arr[rear + 1];
            return front;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
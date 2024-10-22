package dsa.Stack.usingArrayList;

import java.util.ArrayList;
import java.util.Stack;

public class ppp {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        static boolean isEmpty() {
            return list.size() == 0;
        }

        static void push(int data) {
            list.add(data);
        }

        static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
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

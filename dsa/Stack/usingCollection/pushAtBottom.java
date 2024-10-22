package dsa.Stack.usingCollection;

import java.util.Stack;

public class pushAtBottom {
    static void pushAtBott(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBott(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        s.push(7);
        s.push(9);
        pushAtBott(10, s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

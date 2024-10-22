package dsa.Stack.usingCollection;

import java.util.Stack;

public class ppp {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        s.push(7);
        s.push(9);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

package Lecture22Stacks.Assignment;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String a1 = "{([])}" ;
        String a2 = "(){" ;
        String a3 = "()[]" ;
        String a4 = "{([])}";
        System.out.println(solve(a1));
        System.out.println(solve(a2));
        System.out.println(solve(a3));
        System.out.println(solve(a4));
    }
    public static int solve(String A) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char current = A.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                st.push(A.charAt(i));
            } else if (current == ')' || current == '}' || current == ']') {
                if (st.isEmpty()) {
                    return 0;
                }
                char top = st.peek();
                if ((current == ')' && top == '(') || (current == '}' && top == '{')
                        || (current == ']' && top == '[')) {
                    st.pop();
                } else {
                    return 0;
                }
            }

        }
        return st.isEmpty() ? 1 : 0;
    }
}

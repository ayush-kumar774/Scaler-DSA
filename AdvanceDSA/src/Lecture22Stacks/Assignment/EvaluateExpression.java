package Lecture22Stacks.Assignment;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        String[] A = {"2", "1", "+", "3", "*"};
        String[] B = {"4", "13", "5", "/" , "+"};

        System.out.println(evalRPN(A));
        System.out.println(evalRPN(B));
    }
    public static int evalRPN(String[] A) {
        Stack<Integer> stack = new Stack<>();

        for (String str : A) {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int result = switch (str) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> a / b;
                    default -> 0;
                };

                stack.push(result);
            }
            else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}

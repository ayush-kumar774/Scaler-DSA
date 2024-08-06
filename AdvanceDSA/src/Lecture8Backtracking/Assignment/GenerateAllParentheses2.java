package Lecture8Backtracking.Assignment;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllParentheses2 {
    public static void main(String[] args) {
        int a1 = 3, a2 = 1;
        ArrayList<String> res = generateParenthesis(a1);
        System.out.println(res);
        res = generateParenthesis(a2);
        System.out.println(res);
    }
    public static ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, A);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max)
            backtrack(result, current + "(", open + 1, close, max);
        if (close < open)
            backtrack(result, current + ")", open, close + 1, max);
    }
}
/*
Problem Description
Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.



Problem Constraints
1 <= A <= 10



Input Format
First and only argument is integer A.



Output Format
Return a sorted list of all possible parenthesis.



Example Input
Input 1:
A = 3

Input 2:
A = 1


Example Output
Output 1:
[ "((()))", "(()())", "(())()", "()(())", "()()()" ]

Output 2:
[ "()" ]


Example Explanation
Explanation 1:

 All paranthesis are given in the output list.
Explanation 2:

 All paranthesis are given in the output list.
 */
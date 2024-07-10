package Lecture8Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static String[] generateParenthesis(int N) {
        List<String> parenthesesList = new ArrayList<>();
        generateParenthesisBacktrack("" , N , 0 , 0, parenthesesList);
        String[] result = new String[parenthesesList.size()];
        for (int i = 0 ; i < parenthesesList.size(); i++) {
            result[i] = parenthesesList.get(i);
        }
        return result;
    }

    public static void generateParenthesisBacktrack(String str, int N, int open, int closed, List<String> parenthesesList) {
        if (str.length() == 2 * N) {
            parenthesesList.add(str);
//            System.out.println(str);
            return;
        }
        if (open < N) {
            generateParenthesisBacktrack(str + "(", N , open + 1, closed, parenthesesList);
        }
        if (closed < open) {
            generateParenthesisBacktrack(str + ")", N, open, closed + 1, parenthesesList);
        }
    }
    public static void main(String[] args) {
        int A = 2 ;
        String[] allParentheses = generateParenthesis(3);
        for (String str : allParentheses) {
            System.out.println(str);
        }
    }
}
/*
Q 1. Given an integer A, pairs of parentheses, write a function to generate all combinations
of well-formed parentheses of length 2*A.

Eg: A = 1
Output = ()

Eg: A = 2
Output = ()(), (())

 */
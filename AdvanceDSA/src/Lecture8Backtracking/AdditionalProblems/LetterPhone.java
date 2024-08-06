package Lecture8Backtracking.AdditionalProblems;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LetterPhone {
    public static void main(String[] args) {
        String A1 = "23";
        String A2 = "012";
        String [] result = letterCombinations(A1);
        System.out.println(Arrays.toString(result));
        result = letterCombinations(A2);
        System.out.println(Arrays.toString(result));
    }
    public static String[] letterCombinations(String A) {
        String[] mapping = {
                "0",    // for '0'
                "1",    // for '1'
                "abc",  // for '2'
                "def",  // for '3'
                "ghi",  // for '4'
                "jkl",  // for '5'
                "mno",  // for '6'
                "pqrs", // for '7'
                "tuv",  // for '8'
                "wxyz"  // for '9'
        };

        List<String> result = new ArrayList<>();
        if (A == null || A.isEmpty()) {
            return new String[0];
        }

        backtrack(result, new StringBuilder(), A, 0, mapping);

        String[] output = new String[result.size()];
        result.toArray(output);
        return output;
    }

    private static void backtrack(List<String> result, StringBuilder current, String A, int index, String[] mapping) {
        if (index == A.length()) {
            result.add(current.toString());
            return;
        }

        String letters = mapping[A.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(result, current, A, index + 1, mapping);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
/*
Problem Description
Given a digit string A, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.

NOTE: Make sure the returned strings are lexicographically sorted.



Problem Constraints
1 <= |A| <= 10



Input Format
The only argument is a digit string A.



Output Format
Return a string array denoting the possible letter combinations.



Example Input
Input 1:
A = "23"

Input 2:
A = "012"


Example Output
Output 1:
["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]

Output 2:
["01a", "01b", "01c"]
 */
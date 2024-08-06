package Lecture11Maths2CombinatoricsBasics.Assignment;

public class ExcelColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(3));
        System.out.println(convertToTitle(27));
    }
    private static String convertToTitle(int A) {
        StringBuilder result = new StringBuilder();

        while (A > 0) {
            A--;
            int remainder = A % 26;
            char currentChar = (char) ('A' + remainder);
            result.insert(0, currentChar);
            A = A / 26;
        }

        return result.toString();
    }
}
/*
Problem Description
Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB


Problem Constraints
1 <= A <= 109



Input Format
First and only argument of input contains single integer A



Output Format
Return a string denoting the corresponding title.



Example Input

Input 1:
A = 3

Input 2:
A = 27


Example Output

Output 1:
"C"

Output 2:
"AA"


Example Explanation

Explanation 1:
3 corresponds to C.

Explanation 2:
1 -> A,
2 -> B,
3 -> C,
...
26 -> Z,
27 -> AA,
28 -> AB
 */

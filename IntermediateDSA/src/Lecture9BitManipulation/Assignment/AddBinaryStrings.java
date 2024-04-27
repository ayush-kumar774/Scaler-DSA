package Lecture9BitManipulation.Assignment;

public class AddBinaryStrings {
    public static String addBinary(String A, String B) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int indexB = B.length() - 1;
        int indexA = A.length() - 1;

        while (indexB >= 0 || indexA >= 0) {
            int sum = carry;
            if (indexA >= 0) {
                sum += A.charAt(indexA) - '0';
                indexA--;
            }
            if (indexB >= 0) {
                sum += B.charAt(indexB) - '0';
                indexB--;
            }

            ans.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            ans.append(carry);
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String A = "100";
        String B = "11" ;
        System.out.println(addBinary(A, B));
        System.out.println(addBinary("110", "10"));
        System.out.println(addBinary("1001011", "11001001"));
    }
}
/*
Problem Description
Given two binary strings A and B. Return their sum (also a binary string).


Problem Constraints
1 <= length of A <= 105

1 <= length of B <= 105

A and B are binary strings



Input Format
The two argument A and B are binary strings.



Output Format
Return a binary string denoting the sum of A and B



Example Input
Input 1:
A = "100"
B = "11"
Input 2:
A = "110"
B = "10"


Example Output
Output 1:
"111"
Output 2:
"1000"


Example Explanation
For Input 1:
The sum of 100 and 11 is 111.
For Input 2:

The sum of 110 and 10 is 1000.
 */
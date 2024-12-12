package Contest2.Reattempt;

public class KthMissingInteger {
    public static void main(String[] args) {
        int[] A1 = {2, 3, 4, 7, 11};
        int B1 = 5;
        int[] A2 = {1, 2, 3, 4};
        int B2 = 2;

        System.out.println(findMissingNumber(A1, B1));
        System.out.println(findMissingNumber(A2, B2));
    }
    private static int findMissingNumber(int[] A, int B) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missingCount = A[mid] - (mid + 1);

            if (missingCount < B) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        if (right == -1) {
            return B;
        }

        return A[right] + ( B - ( A[right] - (right + 1) ) );
    }
}
/*
Problem Description
You are given a sorted array of distinct positive integers, A, of size N. The array represents a sequence of numbers, but some positive integers are missing from the sequence. Your task is to determine the B-th missing positive integer in the sequence.

Input:
A sorted array A of size N consisting of distinct positive integers.
An integer B which represents the position of the missing positive integer you need to find.

Output:
Return the B-th missing positive integer in the sequence.

Detailed Explanation with Examples
Example 1:
Input:
A = [2, 3, 4, 7, 11]
B = 5

Explanation:
The sequence of positive integers should be: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ...]
The array A has the numbers [2, 3, 4, 7, 11].
Missing numbers in the sequence up to 11: [1, 5, 6, 8, 9, 10]
The 5-th missing number is 9.

Output: 9

Example 2:
Input:
A = [1, 2, 3, 4]
B = 2

Explanation:
The sequence of positive integers should be: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...]
The array A has the numbers [1, 2, 3, 4].
Missing numbers in the sequence up to 4: [5, 6, 7, 8, 9, 10, ...]
The 2nd missing number is 6.

Output: 6

Example 3:
Input:
A = [2, 3, 4, 5]
B = 1

Explanation:
The sequence of positive integers should be: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ...]
The array A has the numbers [2, 3, 4, 5].
Missing numbers in the sequence up to 5: [1, 6, 7, 8, 9, 10, ...]
The 1st missing number is 1.

Output: 1

Example 4:
Input:
A = [3, 4, 5, 6]
B = 3

Explanation:
The sequence of positive integers should be: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ...]
The array A has the numbers [3, 4, 5, 6].
Missing numbers in the sequence up to 6: [1, 2, 7, 8, 9, 10, ...]
The 3rd missing number is 7.

Output: 7
 */
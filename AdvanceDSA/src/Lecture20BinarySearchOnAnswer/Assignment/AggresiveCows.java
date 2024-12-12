package Lecture20BinarySearchOnAnswer.Assignment;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        int[] shed1 = {1, 2, 3, 4, 5};
        int cows1 = 3;

        int[] shed2 = {1, 2};
        int cows2 = 2;
        System.out.println(aggressiveCows(shed1, cows1));
        System.out.println(aggressiveCows(shed2, cows2));
    }
    private static int aggressiveCows(int[] shed, int cows) {
        int n = shed.length;
        int s = 1;
        Arrays.sort(shed);
        int e = shed[n - 1] - shed[0];
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2 ;
            if (isPossible(shed, mid, cows)) {
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] shed, int dist, int numberOfCows) {
        int cows = 1 ;
        int lastPos = shed[0];
        for (int i = 1; i < shed.length; i++) {
            if (shed[i] - lastPos >= dist) { // New cow can be placed here
                cows++;
                lastPos = shed[i];
                if (cows == numberOfCows) {
                    return true;
                }
            }
        }
        return false;
    }
}
/*
Problem Description
Farmer John has built a new long barn with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall and an integer B which represents the number of cows.

His cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?



Problem Constraints
2 <= N <= 100000
0 <= A[i] <= 109
2 <= B <= N



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return the largest minimum distance possible among the cows.



Example Input

Input 1:
A = [1, 2, 3, 4, 5]
B = 3

Input 2:
A = [1, 2]
B = 2


Example Output

Output 1:
2

Output 2:
1


Example Explanation

Explanation 1:
John can assign the stalls at location 1, 3 and 5 to the 3 cows respectively. So the minimum distance will be 2.

Explanation 2:
The minimum distance will be 1.
 */

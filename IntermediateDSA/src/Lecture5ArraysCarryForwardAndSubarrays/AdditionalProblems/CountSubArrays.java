package Lecture5ArraysCarryForwardAndSubarrays.AdditionalProblems;

import java.util.HashMap;

public class CountSubArrays {

    public static int countUniqueSubArray(int[] A) {
        int counter = 0;
        int mod = 1000000007;
        int l = 0, r = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (r < A.length) {
            map.put(A[r], map.getOrDefault(A[r], 0) + 1);

            while (map.get(A[r]) > 1) {
                map.put(A[l], map.get(A[l]) - 1);
                if (map.get(A[l]) == 0) {
                    map.remove(A[l]);
                }
                l++;
            }
            counter = (counter + (r - l + 1)) % mod;
            r++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 2};
        System.out.println(countUniqueSubArray(A));
    }
}

/*
Misha likes finding all Subarrays of an Array. Now she gives you an array A of N elements and tells you to
find the number of subarrays of A, that have unique elements.
Since the number of subarrays could be large, return value % 10^9 +7.
Example Input

Input 1:

 A = [1, 1, 3]
Input 2:

 A = [2, 1, 2]


Example Output

Output 1:

 4
Output 1:

 5


Example Explanation

Explanation 1:

 Subarrays of A that have unique elements only:
 [1], [1], [1, 3], [3]
Explanation 2:

 Subarrays of A that have unique elements only:
 [2], [1], [2, 1], [1, 2], [2]
 */
package Lecture1Arrays1OneDimensional;

public class MaximumSumOfSubArray {
    public int maxSubArraySum3(int[] nums) {
        int runningSum = nums[0];
        int currentSum = nums[0];
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); // Update currentSum correctly
            runningSum = Math.max(runningSum, currentSum);
        }

        return runningSum;
    }

    public static int maxSubArraySum(int[] nums) {
        int curr = 0 ;
        int ans = Integer.MIN_VALUE;

        for (int num : nums) {
            curr = curr + num;
            ans = Math.max(curr, ans);
            if (curr <= 0) {
                curr = 0;
            }
        }
        return ans;
    }

    public static int maxSubArraySum2(int[] nums) {
        int sum ;
        int max = 0;
        int n = nums.length;
        for (int i = 0 ; i < n ; i++) {
            sum = 0 ;
            for (int j = i ; j < n ; j++) {
                sum += nums[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 4, 1};
        int[] arr2 = {-2, 3, 4, -1, 5, -10, 7 };
        System.out.println("Maximum sum of subarray: " + maxSubArraySum(arr));
        System.out.println("Maximum sum of subarray: " + maxSubArraySum2(arr));
        System.out.println("Maximum sum of subarray: " + maxSubArraySum(arr2));
        System.out.println("Maximum sum of subarray: " + maxSubArraySum2(arr2));
    }
}

/*
A[] = {-3, 4, 1}
Answer --> 5

Problem Description
Find the maximum sum of contiguous non-empty subarray within an array A of length N.



Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:

 A = [1, 2, 3, 4, -10]
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]


Example Output
Output 1:

 10
Output 2:

 6


Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6.
 */
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
 */
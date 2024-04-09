package Lecture5ArraysCarryForwardAndSubarrays.Assignment;

import static Lecture3IntroductionToArrays.Arrays.printArray;

public class SubarrayInGivenRange {
    public static int[] subarrayInRange(int[] A, int B, int C) {
        int[] ans = new int[Math.abs(C - B) + 1];
        int index = 0;
        for (int i = B; i <= C; i++) {
            ans[index] = A[i];
            index++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6};
        int B = 1;
        int C = 3;
        printArray(subarrayInRange(A, B, C));
    }
}

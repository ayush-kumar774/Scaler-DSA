package Lecture3IntroductionToArrays.AdditionalProblems;

public class SecondLargest {
    public static int solve(int[] A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int j : A) {
            if (j > max1) max1 = j;
        }

        for (int j : A) {
            if (j > max2 && j < max1) max2 = j;
        }

        if (max2 == Integer.MIN_VALUE) {
            return -1;
        } else {
            return max2;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 2};
        System.out.println(solve(arr));
    }
}

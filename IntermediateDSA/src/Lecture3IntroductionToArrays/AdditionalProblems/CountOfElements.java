package Lecture3IntroductionToArrays.AdditionalProblems;

public class CountOfElements {
    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int counter = 0 ;
        for (int j : A) {
            if (j > max) max = j;
        }
        for (int j : A) {
            if (max > j) counter++;
        }
        return counter ;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 5, 3};
        System.out.println(solve(arr));
    }
}
